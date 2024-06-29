import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ha")
public class class13 {

    @OriginalMember(owner = "mapview!ha", name = "f", descriptor = "I")
    private int field112 = 0;

    @OriginalMember(owner = "mapview!ha", name = "g", descriptor = "[I")
    private int[] field113 = new int[1500];

    @OriginalMember(owner = "mapview!ha", name = "j", descriptor = "[I")
    public int[] field116 = new int[1500];

    @OriginalMember(owner = "mapview!ha", name = "c", descriptor = "[I")
    public int[] field109 = new int[1500];

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "[I")
    private int[] field107 = new int[1500];

    @OriginalMember(owner = "mapview!ha", name = "n", descriptor = "[I")
    private int[] field120 = new int[1500];

    @OriginalMember(owner = "mapview!ha", name = "i", descriptor = "[I")
    public int[] field115 = new int[1500];

    @OriginalMember(owner = "mapview!ha", name = "b", descriptor = "Lia;")
    public static class15 field108 = class28.method196("Amulet Shop", false);

    @OriginalMember(owner = "mapview!ha", name = "d", descriptor = "Lia;")
    public static class15 field110 = class28.method196("Scimitar Shop", false);

    @OriginalMember(owner = "mapview!ha", name = "k", descriptor = "Lia;")
    public static class15 field117 = class28.method196("Tannery", false);

    @OriginalMember(owner = "mapview!ha", name = "l", descriptor = "Lia;")
    public static class15 field118 = class28.method196("Achievement Start", false);

    @OriginalMember(owner = "mapview!ha", name = "h", descriptor = "Lh;")
    public static class12 field114 = null;

    @OriginalMember(owner = "mapview!ha", name = "m", descriptor = "Lia;")
    public static class15 field119 = class28.method196("Guide", false);

    @OriginalMember(owner = "mapview!ha", name = "o", descriptor = "[I")
    public static int[] field121 = new int[128];

    @OriginalMember(owner = "mapview!ha", name = "e", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(B[B)V", line = 22)
    private final void method74(byte arg0, byte[] arg1) {
        int var3 = 0;
        while (true) {
            while (var3 < arg1.length) {
                int var4 = (arg1[var3++] & 0xFF) * 64 - class28.field403;
                int var5 = (arg1[var3++] & 0xFF) * 64 - class34.field483;
                if (var4 > 0 && var5 > 0 && var4 + 64 < class35.field495 && var5 + 64 < class15.field150) {
                    class2.field16 = class15.field150 - var5 - 1 >> 6;
                    class36.field503 = var4 >> 6;
                    for (int var6 = 0; var6 < 64; var6++) {
                        for (int var7 = -64; var7 < 0; var7++) {
                            int var8 = arg1[var3++] & 0xFF;
                            if (var8 != 0) {
                                byte var9 = arg1[var3++];
                                class2.method14(var9, false, class15.field150 - var5 - var7 - 64 - 1, 3, var4 + var6);
                                if (class19.field222[class2.field16][class36.field503] == null) {
                                    class19.field222[class2.field16][class36.field503] = new class6();
                                    class19.field222[class2.field16][class36.field503].field57 = new byte[4096];
                                }
                                class19.field222[class2.field16][class36.field503].field57[(-(var7 + 1) << 6) + var6] = (byte) var8;
                            }
                        }
                    }
                    if (class19.field222[class2.field16][class36.field503] != null) {
                        class19.field222[class2.field16][class36.field503].method27(-116);
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
            if (arg0 != -84) {
                this.method77((byte) 85, 1.0588507661251336D, 2.831250276481318D, 1.4164772189310182D);
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(IIIIIIIII)V", line = 106)
    public final void method75(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = arg5 - arg1;
        if (arg7 != 2) {
            this.method75(93, 6, -115, 113, -57, -15, 43, -1, 67);
        }
        int var11 = arg4 - arg3;
        int var12 = (arg6 - arg0 << 16) / var11;
        int var13 = (arg2 - arg8 << 16) / var10;
        for (int var14 = 0; var14 < var10; var14++) {
            int var15 = var13 * var14 >> 16;
            int var16 = (var14 + 1) * var13 >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                int var18 = arg8 + var15;
                int var19 = arg8 + var16;
                class29.method198((byte) 88, arg3, var14 + arg1);
                for (int var20 = 0; var20 < var11; var20++) {
                    int var21 = var12 * var20 >> 16;
                    int var22 = (var20 + 1) * var12 >> 16;
                    int var23 = var22 - var21;
                    if (var23 > 0) {
                        int var24 = arg0 + var21;
                        int var25 = arg0 + var22;
                        int var26 = class26.method182((byte) -120);
                        int var27 = class18.method141(arg7 - 20503);
                        if (var26 == 0 && var27 == 0) {
                            class8.method41(var18, var24, var19 - var18, -var24 + var25, class30.method202(arg7 - 2));
                        } else {
                            byte var28 = class31.method211((byte) -96);
                            int var29 = var28 & 0xFC;
                            if (var29 == 0 || var17 <= 1 || var23 <= 1) {
                                class8.method41(var18, var24, var17, var23, var26);
                            } else {
                                this.method88(class30.method202(0), class8.field67 * var24 + var18, var29 >> 2, true, var26, var23, (byte) -63, class8.field70, var17, var28 & 0x3);
                            }
                            if (var27 > 0) {
                                byte var30 = class30.method205(-103);
                                int var31 = var30 & 0xFC;
                                if (var31 == 0 || var17 <= 1 || var23 <= 1) {
                                    class8.method41(var18, var24, var17, var23, var27);
                                }
                                this.method88(class30.method202(0), class8.field67 * var24 + var18, var31 >> 2, var26 == 0, var27, var23, (byte) -63, class8.field70, var17, var30 & 0x3);
                            }
                        }
                    }
                    class35.method241(-94);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(I)B", line = 200)
    private static final byte method76(int arg0) {
        if (arg0 != -14259) {
            field108 = null;
        }
        return class39.field515 == null ? 0 : class39.field515[field111];
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(BDDD)I", line = 219)
    private final int method77(byte arg0, double arg1, double arg2, double arg3) {
        double var8 = arg3;
        double var10 = arg3;
        double var12 = arg3;
        if (arg2 != 0.0D) {
            double var14;
            if (arg3 < 0.5D) {
                var14 = (arg2 + 1.0D) * arg3;
            } else {
                var14 = arg2 + arg3 - arg2 * arg3;
            }
            double var16 = arg3 * 2.0D - var14;
            double var18 = arg1 + 0.3333333333333333D;
            if (var18 > 1.0D) {
                var18--;
            }
            if (var18 * 6.0D < 1.0D) {
                var8 = (var14 - var16) * 6.0D * var18 + var16;
            } else if (var18 * 2.0D < 1.0D) {
                var8 = var14;
            } else if (var18 * 3.0D < 2.0D) {
                var8 = (var14 - var16) * (0.6666666666666666D - var18) * 6.0D + var16;
            } else {
                var8 = var16;
            }
            if (arg1 * 6.0D < 1.0D) {
                var10 = (var14 - var16) * 6.0D * arg1 + var16;
            } else if (arg1 * 2.0D < 1.0D) {
                var10 = var14;
            } else if (arg1 * 3.0D < 2.0D) {
                var10 = (var14 - var16) * (-arg1 + 0.6666666666666666D) * 6.0D + var16;
            } else {
                var10 = var16;
            }
            double var22 = arg1 - 0.3333333333333333D;
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
        if (arg0 == -34) {
            int var24 = (int) (var8 * 256.0D);
            int var25 = (int) (var10 * 256.0D);
            int var26 = (int) (var12 * 256.0D);
            return (var24 << 16) + (var25 << 8) + var26;
        } else {
            return 72;
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(III)V", line = 314)
    private final void method78(int arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            this.method89(9, -123, -61, 3, -112, 1, -50, -70, 73);
        }
        int var4 = arg1 >> 6;
        int var5 = arg0 >> 6;
        class19.field222 = new class6[var4][var5];
        class2.field17[2] = new byte[var4][var5][];
        class2.field17[4] = new byte[var4][var5][];
        class2.field17[1] = new byte[var4][var5][];
        class2.field17[0] = new byte[var4][var5][];
        class36.field499 = new int[var4][var5][];
        class2.field17[3] = new byte[var4][var5][];
        class26.field370 = new class6[var4][var5];
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(IIIIDIIIII)V", line = 337)
    public final void method79(int arg0, int arg1, int arg2, int arg3, double arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var12 = arg7 - arg0;
        int var13 = arg3 - arg8;
        int var14 = (arg6 - arg2 << 16) / var13;
        int var15 = (arg1 - arg9 << 16) / var12;
        if (arg1 - arg9 < -arg0 + arg7) {
            return;
        }
        this.field112 = 0;
        for (int var16 = 0; var16 < var12; var16++) {
            int var17 = (var16 + 1) * var15 >> 16;
            int var18 = var15 * var16 >> 16;
            int var19 = var17 - var18;
            if (var19 > 0) {
                class29.method198((byte) 52, arg8, arg0 + var16);
                for (int var20 = 0; var20 < var13; var20++) {
                    int var21 = var14 * var20 >> 16;
                    int var22 = (var20 + 1) * var14 >> 16;
                    int var23 = var22 - var21;
                    if (var23 > 0) {
                        int var24 = method76(-14259) & 0xFF;
                        if (var24 != 0) {
                            if (var24 == 47 || var24 == 53) {
                                class29.field412[var24 - 1].method259(var18, var21, var19 * 2 + 1, var23 * 2 + 1);
                                if (!(arg4 < 4.0D) && arg4 > 4.2D && !(arg4 > 6.2D)) {
                                }
                            } else {
                                class29.field412[var24 - 1].method259(var18 - var19 / 2, var21 - var23 / 2, var19 * 2, var23 * 2);
                            }
                        }
                    }
                    class35.method241(20);
                }
            }
        }
        if (arg5 != 1639797104) {
            field118 = null;
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(I[B)V", line = 459)
    private final void method80(int arg0, byte[] arg1) {
        if (arg0 != 2) {
            this.method80(-118, null);
        }
        int var3 = 0;
        while (true) {
            while (var3 < arg1.length) {
                int var4 = (arg1[var3++] & 0xFF) * 64 - class28.field403;
                int var5 = (arg1[var3++] & 0xFF) * 64 - class34.field483;
                if (var4 > 0 && var5 > 0 && var4 + 64 < class35.field495 && var5 + 64 < class15.field150) {
                    for (int var6 = 0; var6 < 64; var6++) {
                        int var7 = class15.field150 - var5 - 1;
                        for (int var8 = -64; var8 < 0; var8++) {
                            while (true) {
                                int var9 = arg1[var3++] & 0xFF;
                                if (var9 == 0) {
                                    break;
                                }
                                if (var9 < 29) {
                                    class2.method14((byte) var9, false, class15.field150 - var8 - var5 - 1 - 64, 0, var4 + var6);
                                } else if (var9 >= 160) {
                                    class2.method14((byte) (var9 - 159), false, class15.field150 - var5 - var8 - 1 - 64, 2, var4 + var6);
                                    if (class10.field81 >= 1500) {
                                        break;
                                    }
                                    this.field116[class10.field81] = var6 + var4;
                                    this.field115[class10.field81] = var7;
                                    this.field109[class10.field81] = var9 - 160;
                                    class10.field81++;
                                } else {
                                    class2.method14((byte) (var9 - 28), false, class15.field150 - var8 - var5 - 1 - 64, 1, var4 + var6);
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
                                var12 = arg1[var3++];
                            } while (var12 != 0);
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(IIIIIIIIIII)V", line = 565)
    public final void method81(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (this.field112 == 0) {
            int var12 = arg2 - arg9;
            int var13 = arg5 - arg6;
            int var14 = (arg3 - arg4 << 16) / var12;
            int var15 = (arg7 - arg1 << 16) / var13;
            for (int var16 = 0; var16 < var12; var16++) {
                int var17 = var14 * var16 >> 16;
                int var18 = (var16 + 1) * var14 >> 16;
                int var19 = var18 - var17;
                if (var19 > 0) {
                    class29.method198((byte) 126, arg6, arg9 + var16);
                    for (int var20 = 0; var20 < var13; var20++) {
                        int var21 = var15 * var20 >> 16;
                        int var22 = (var20 + 1) * var15 >> 16;
                        int var23 = var22 - var21;
                        if (var23 > 0) {
                            int var24 = class26.method178((byte) 106) & 0xFF;
                            if (var24 != 0) {
                                this.field120[this.field112] = var24 - 1;
                                this.field107[this.field112] = var19 / 2 + var17;
                                this.field113[this.field112] = var23 / 2 + var21;
                                this.field112++;
                            }
                        }
                        class35.method241(arg8 ^ 0x30D6);
                    }
                }
            }
        }
        for (int var25 = 0; var25 < this.field112; var25++) {
            if (class1.field6[this.field120[var25]] != null) {
                class1.field6[this.field120[var25]].method33(this.field107[var25] - 7, this.field113[var25] + -7);
            }
        }
        if (arg10 > 0) {
            for (int var26 = 0; var26 < this.field112; var26++) {
                if (this.field120[var26] == arg0) {
                    class1.field6[this.field120[var26]].method33(this.field107[var26] - 7, this.field113[var26] + -7);
                    if (arg10 % 10 < 5) {
                        class8.method39(this.field107[var26], this.field113[var26], 15, 16776960, 128);
                        class8.method39(this.field107[var26], this.field113[var26], 7, 16777215, 256);
                    }
                }
            }
        }
        this.field112 = 0;
        if (arg8 != 12428) {
            this.method80(69, null);
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(BLl;)V", line = 680)
    public final void method82(byte arg0, class20 arg1) {
        class1 var3 = new class1(arg1.method186(113, class3.field29, class17.field175));
        int var4 = var3.method1(-1119584920);
        int var5 = var3.method1(-1119584920);
        int var6 = var3.method1(-1119584920);
        int var7 = var3.method1(-1119584920);
        int var8 = var3.method1(-1119584920);
        int var9 = var3.method1(-1119584920);
        var3.method2(false);
        class15.field150 = (var7 - var5) * 64 + 64;
        class35.field495 = (var6 + 1 - var4) * 64;
        class34.field483 = var5 * 64;
        class28.field403 = var4 * 64;
        class11.field95 = class34.field483 + class15.field150 - var9 * 64;
        class30.field427 = var8 * 64 - class28.field403;
        this.method78(class35.field495, class15.field150, -1);
        class1 var10 = new class1(arg1.method186(64, class3.field29, class33.field478));
        int var11 = var10.method1(-1119584920);
        class21.field237 = new int[var11 + 1];
        for (int var12 = 0; var12 < var11; var12++) {
            class21.field237[var12 + 1] = var10.method7(18811);
        }
        int var13 = var10.method1(-1119584920);
        class18.field187 = new int[var13 + 1];
        for (int var14 = 0; var14 < var13; var14++) {
            class18.field187[var14 + 1] = var10.method7(18811);
        }
        byte[] var15 = arg1.method186(75, class3.field29, class12.field99);
        byte[][] var16 = new byte[class35.field495][class15.field150];
        this.method84(var16, var15, -21607);
        byte[] var17 = arg1.method186(119, class3.field29, class2.field13);
        this.method74((byte) -84, var17);
        byte[] var18 = arg1.method186(113, class3.field29, class18.field186);
        if (arg0 >= -126) {
            return;
        }
        this.method87(var18, (byte) 120);
        byte[] var19 = arg1.method186(123, class3.field29, class29.field413);
        class10.field81 = 0;
        this.method80(2, var19);
        this.method85(5, var16);
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(IIILoa;)[Lda;", line = 750)
    public static final class7[] method83(int arg0, int arg1, int arg2, class27 arg3) {
        if (arg0 != 26662) {
            method83(50, -41, 106, null);
        }
        return class9.method49(arg3, arg0 - 26635, arg1, arg2) ? class19.method143((byte) 104) : null;
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "([[B[BI)V", line = 780)
    private final void method84(byte[][] arg0, byte[] arg1, int arg2) {
        if (arg2 != -21607) {
            this.method87(null, (byte) -38);
        }
        int var4 = 0;
        while (true) {
            while (arg1.length > var4) {
                int var5 = (arg1[var4++] & 0xFF) * 64 - class28.field403;
                int var6 = (arg1[var4++] & 0xFF) * 64 - class34.field483;
                if (var5 > 0 && var6 > 0 && var5 + 64 < class35.field495 && class15.field150 > var6 + 64) {
                    for (int var7 = 0; var7 < 64; var7++) {
                        int var8 = class15.field150 - var6 - 1;
                        byte[] var9 = arg0[var5 + var7];
                        for (int var10 = -64; var10 < 0; var10++) {
                            var9[var8--] = arg1[var4++];
                        }
                    }
                } else {
                    var4 += 4096;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(I[[B)V", line = 831)
    private final void method85(int arg0, byte[][] arg1) {
        int var3 = class35.field495;
        int var4 = class15.field150;
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = 0;
        }
        for (int var7 = arg0; var7 < var3 - 5; var7++) {
            byte[] var8 = arg1[var7 + 5];
            byte[] var9 = arg1[var7 - 5];
            for (int var10 = 0; var10 < var4; var10++) {
                int var11 = class21.field237[var8[var10] & 0xFF];
                int var12 = class21.field237[var9[var10] & 0xFF];
                if (var11 <= 0 && class34.method232(var7 + 5, var10, (byte) -96) > 0) {
                    var11 = 64;
                }
                if (var12 <= 0 && class34.method232(var7 - 5, var10, (byte) -68) > 0) {
                    var12 = 64;
                }
                var5[var10] += var11 - var12;
            }
            if (var7 > 10 && var7 < var3 - 10) {
                int var13 = 0;
                int var14 = 0;
                int var15 = 0;
                for (int var16 = 5; var16 < var4 - 5; var16++) {
                    int var17 = var5[var16 - 5];
                    int var18 = var5[var16 + 5];
                    var14 += (var18 >> 10 & 0x3FF) - ((var17 & 0xFFE4A) >> 10);
                    var13 += (var18 >> 20) - (var17 >> 20);
                    var15 += (var18 & 0x3FF) - (var17 & 0x3FF);
                    if (var15 > 0) {
                        int var19 = var7 >> 6;
                        int var20 = var16 >> 6;
                        if (class36.field499[var20][var19] == null) {
                            class36.field499[var20][var19] = new int[4096];
                        }
                        if ((arg1[var7][var16] & 0xFF) <= 0) {
                            class36.field499[var20][var19][class29.method201(63, var7) + (class29.method201(63, var16) << 6)] = 0;
                        } else {
                            class36.field499[var20][var19][class29.method201(4032, var16 << 6) + class29.method201(var7, 63)] = this.method77((byte) -34, (double) var13 / 8533.0D, (double) var14 / 8533.0D, (double) var15 / 8533.0D);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(Z)V", line = 931)
    public static void method86(boolean arg0) {
        field117 = null;
        field121 = null;
        field119 = null;
        if (arg0) {
            field108 = null;
        }
        field110 = null;
        field108 = null;
        field118 = null;
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "([BB)V", line = 947)
    private final void method87(byte[] arg0, byte arg1) {
        int var3 = 82 / ((arg1 - 64) / 55);
        int var4 = 0;
        while (true) {
            while (arg0.length > var4) {
                int var5 = (arg0[var4++] & 0xFF) * 64 - class28.field403;
                int var6 = (arg0[var4++] & 0xFF) * 64 - class34.field483;
                if (var5 > 0 && var6 > 0 && class35.field495 > var5 + 64 && class15.field150 > var6 + 64) {
                    class2.field16 = class15.field150 - var6 - 1 >> 6;
                    class36.field503 = var5 >> 6;
                    for (int var7 = 0; var7 < 64; var7++) {
                        for (int var8 = -64; var8 < 0; var8++) {
                            int var9 = arg0[var4++] & 0xFF;
                            if (var9 != 0) {
                                byte var10 = arg0[var4++];
                                class2.method14(var10, false, class15.field150 - var6 - var8 - 64 - 1, 4, var5 + var7);
                                if (class26.field370[class2.field16][class36.field503] == null) {
                                    class26.field370[class2.field16][class36.field503] = new class6();
                                    class26.field370[class2.field16][class36.field503].field57 = new byte[4096];
                                }
                                class26.field370[class2.field16][class36.field503].field57[(-(var8 + 1) << 6) + var7] = (byte) var9;
                            }
                        }
                    }
                    if (class26.field370[class2.field16][class36.field503] != null) {
                        class26.field370[class2.field16][class36.field503].method27(75);
                    }
                } else {
                    for (int var11 = -4096; var11 < 0; var11++) {
                        byte var12 = arg0[var4++];
                        if (var12 != 0) {
                            var4++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(IIIZIIB[III)V", line = 1034)
    private final void method88(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, byte arg6, int[] arg7, int arg8, int arg9) {
        if (arg2 == 9) {
            arg9 = arg9 + 1 & 0x3;
            arg2 = 1;
        }
        int var11 = class8.field67 - arg8;
        if (arg2 == 10) {
            arg2 = 1;
            arg9 = arg9 + 3 & 0x3;
        }
        if (arg2 == 11) {
            arg2 = 8;
            arg9 = arg9 + 3 & 0x3;
        }
        if (arg6 != -63) {
            this.method84(null, null, 25);
        }
        if (arg2 == 1) {
            if (arg9 == 0) {
                for (int var68 = 0; var68 < arg5; var68++) {
                    for (int var69 = 0; var69 < arg8; var69++) {
                        if (var68 >= var69) {
                            arg7[arg1] = arg4;
                        } else if (arg3) {
                            arg7[arg1] = arg0;
                        }
                        arg1++;
                    }
                    arg1 += var11;
                }
            } else if (arg9 == 1) {
                for (int var74 = arg5 - 1; var74 >= 0; var74--) {
                    for (int var75 = 0; var75 < arg8; var75++) {
                        if (var75 <= var74) {
                            arg7[arg1] = arg4;
                        } else if (arg3) {
                            arg7[arg1] = arg0;
                        }
                        arg1++;
                    }
                    arg1 += var11;
                }
            } else if (arg9 == 2) {
                for (int var70 = 0; var70 < arg5; var70++) {
                    for (int var71 = 0; var71 < arg8; var71++) {
                        if (var70 <= var71) {
                            arg7[arg1] = arg4;
                        } else if (arg3) {
                            arg7[arg1] = arg0;
                        }
                        arg1++;
                    }
                    arg1 += var11;
                }
            } else if (arg9 == 3) {
                for (int var72 = arg5 - 1; var72 >= 0; var72--) {
                    for (int var73 = 0; var73 < arg8; var73++) {
                        if (var72 <= var73) {
                            arg7[arg1] = arg4;
                        } else if (arg3) {
                            arg7[arg1] = arg0;
                        }
                        arg1++;
                    }
                    arg1 += var11;
                }
            }
        } else if (arg2 == 2) {
            if (arg9 == 0) {
                for (int var60 = arg5 - 1; var60 >= 0; var60--) {
                    for (int var61 = 0; var61 < arg8; var61++) {
                        if (var60 >> 1 >= var61) {
                            arg7[arg1] = arg4;
                        } else if (arg3) {
                            arg7[arg1] = arg0;
                        }
                        arg1++;
                    }
                    arg1 += var11;
                }
            } else if (arg9 == 1) {
                for (int var62 = 0; var62 < arg5; var62++) {
                    for (int var63 = 0; var63 < arg8; var63++) {
                        if (var63 >= var62 << 1) {
                            arg7[arg1] = arg4;
                        } else if (arg3) {
                            arg7[arg1] = arg0;
                        }
                        arg1++;
                    }
                    arg1 += var11;
                }
            } else if (arg9 == 2) {
                for (int var66 = 0; var66 < arg5; var66++) {
                    for (int var67 = arg8 - 1; var67 >= 0; var67--) {
                        if (var67 <= var66 >> 1) {
                            arg7[arg1] = arg4;
                        } else if (arg3) {
                            arg7[arg1] = arg0;
                        }
                        arg1++;
                    }
                    arg1 += var11;
                }
            } else if (arg9 == 3) {
                for (int var64 = arg5 - 1; var64 >= 0; var64--) {
                    for (int var65 = arg8 - 1; var65 >= 0; var65--) {
                        if (var64 << 1 <= var65) {
                            arg7[arg1] = arg4;
                        } else if (arg3) {
                            arg7[arg1] = arg0;
                        }
                        arg1++;
                    }
                    arg1 += var11;
                }
            }
        } else if (arg2 == 3) {
            if (arg9 == 0) {
                for (int var18 = arg5 - 1; var18 >= 0; var18--) {
                    for (int var19 = arg8 - 1; var19 >= 0; var19--) {
                        if (var19 <= var18 >> 1) {
                            arg7[arg1] = arg4;
                        } else if (arg3) {
                            arg7[arg1] = arg0;
                        }
                        arg1++;
                    }
                    arg1 += var11;
                }
            } else if (arg9 == 1) {
                for (int var16 = arg5 - 1; var16 >= 0; var16--) {
                    for (int var17 = 0; var17 < arg8; var17++) {
                        if (var16 << 1 <= var17) {
                            arg7[arg1] = arg4;
                        } else if (arg3) {
                            arg7[arg1] = arg0;
                        }
                        arg1++;
                    }
                    arg1 += var11;
                }
            } else if (arg9 == 2) {
                for (int var12 = 0; var12 < arg5; var12++) {
                    for (int var13 = 0; var13 < arg8; var13++) {
                        if (var12 >> 1 >= var13) {
                            arg7[arg1] = arg4;
                        } else if (arg3) {
                            arg7[arg1] = arg0;
                        }
                        arg1++;
                    }
                    arg1 += var11;
                }
            } else if (arg9 == 3) {
                for (int var14 = 0; var14 < arg5; var14++) {
                    for (int var15 = arg8 - 1; var15 >= 0; var15--) {
                        if (var15 >= var14 << 1) {
                            arg7[arg1] = arg4;
                        } else if (arg3) {
                            arg7[arg1] = arg0;
                        }
                        arg1++;
                    }
                    arg1 += var11;
                }
            }
        } else if (arg2 == 4) {
            if (arg9 == 0) {
                for (int var20 = arg5 - 1; var20 >= 0; var20--) {
                    for (int var21 = 0; var21 < arg8; var21++) {
                        if (var20 >> 1 <= var21) {
                            arg7[arg1] = arg4;
                        } else if (arg3) {
                            arg7[arg1] = arg0;
                        }
                        arg1++;
                    }
                    arg1 += var11;
                }
            } else if (arg9 == 1) {
                for (int var26 = 0; var26 < arg5; var26++) {
                    for (int var27 = 0; var27 < arg8; var27++) {
                        if (var27 <= var26 << 1) {
                            arg7[arg1] = arg4;
                        } else if (arg3) {
                            arg7[arg1] = arg0;
                        }
                        arg1++;
                    }
                    arg1 += var11;
                }
            } else if (arg9 == 2) {
                for (int var22 = 0; var22 < arg5; var22++) {
                    for (int var23 = arg8 - 1; var23 >= 0; var23--) {
                        if (var22 >> 1 <= var23) {
                            arg7[arg1] = arg4;
                        } else if (arg3) {
                            arg7[arg1] = arg0;
                        }
                        arg1++;
                    }
                    arg1 += var11;
                }
            } else if (arg9 == 3) {
                for (int var24 = arg5 - 1; var24 >= 0; var24--) {
                    for (int var25 = arg8 - 1; var25 >= 0; var25--) {
                        if (var24 << 1 >= var25) {
                            arg7[arg1] = arg4;
                        } else if (arg3) {
                            arg7[arg1] = arg0;
                        }
                        arg1++;
                    }
                    arg1 += var11;
                }
            }
        } else if (arg2 != 5) {
            if (arg2 == 6) {
                if (arg9 == 0) {
                    for (int var50 = 0; var50 < arg5; var50++) {
                        for (int var51 = 0; var51 < arg8; var51++) {
                            if (var51 <= arg8 / 2) {
                                arg7[arg1] = arg4;
                            } else if (arg3) {
                                arg7[arg1] = arg0;
                            }
                            arg1++;
                        }
                        arg1 += var11;
                    }
                    return;
                }
                if (arg9 == 1) {
                    for (int var48 = 0; var48 < arg5; var48++) {
                        for (int var49 = 0; var49 < arg8; var49++) {
                            if (arg5 / 2 >= var48) {
                                arg7[arg1] = arg4;
                            } else if (arg3) {
                                arg7[arg1] = arg0;
                            }
                            arg1++;
                        }
                        arg1 += var11;
                    }
                    return;
                }
                if (arg9 == 2) {
                    for (int var46 = 0; var46 < arg5; var46++) {
                        for (int var47 = 0; var47 < arg8; var47++) {
                            if (arg8 / 2 <= var47) {
                                arg7[arg1] = arg4;
                            } else if (arg3) {
                                arg7[arg1] = arg0;
                            }
                            arg1++;
                        }
                        arg1 += var11;
                    }
                    return;
                }
                if (arg9 == 3) {
                    for (int var28 = 0; var28 < arg5; var28++) {
                        for (int var29 = 0; var29 < arg8; var29++) {
                            if (var28 >= arg5 / 2) {
                                arg7[arg1] = arg4;
                            } else if (arg3) {
                                arg7[arg1] = arg0;
                            }
                            arg1++;
                        }
                        arg1 += var11;
                    }
                    return;
                }
            }
            if (arg2 == 7) {
                if (arg9 == 0) {
                    for (int var44 = 0; var44 < arg5; var44++) {
                        for (int var45 = 0; var45 < arg8; var45++) {
                            if (var45 <= var44 - arg5 / 2) {
                                arg7[arg1] = arg4;
                            } else if (arg3) {
                                arg7[arg1] = arg0;
                            }
                            arg1++;
                        }
                        arg1 += var11;
                    }
                    return;
                }
                if (arg9 == 1) {
                    for (int var30 = arg5 - 1; var30 >= 0; var30--) {
                        for (int var31 = 0; var31 < arg8; var31++) {
                            if (var31 <= var30 - arg5 / 2) {
                                arg7[arg1] = arg4;
                            } else if (arg3) {
                                arg7[arg1] = arg0;
                            }
                            arg1++;
                        }
                        arg1 += var11;
                    }
                    return;
                }
                if (arg9 == 2) {
                    for (int var32 = arg5 - 1; var32 >= 0; var32--) {
                        for (int var33 = arg8 - 1; var33 >= 0; var33--) {
                            if (var32 - arg5 / 2 >= var33) {
                                arg7[arg1] = arg4;
                            } else if (arg3) {
                                arg7[arg1] = arg0;
                            }
                            arg1++;
                        }
                        arg1 += var11;
                    }
                    return;
                }
                if (arg9 == 3) {
                    for (int var34 = 0; var34 < arg5; var34++) {
                        for (int var35 = arg8 - 1; var35 >= 0; var35--) {
                            if (var35 <= var34 - arg5 / 2) {
                                arg7[arg1] = arg4;
                            } else if (arg3) {
                                arg7[arg1] = arg0;
                            }
                            arg1++;
                        }
                        arg1 += var11;
                    }
                    return;
                }
            }
            if (arg2 == 8) {
                if (arg9 == 0) {
                    for (int var36 = 0; var36 < arg5; var36++) {
                        for (int var37 = 0; var37 < arg8; var37++) {
                            if (var36 - arg5 / 2 <= var37) {
                                arg7[arg1] = arg4;
                            } else if (arg3) {
                                arg7[arg1] = arg0;
                            }
                            arg1++;
                        }
                        arg1 += var11;
                    }
                    return;
                }
                if (arg9 == 1) {
                    for (int var38 = arg5 - 1; var38 >= 0; var38--) {
                        for (int var39 = 0; var39 < arg8; var39++) {
                            if (var39 >= var38 - arg5 / 2) {
                                arg7[arg1] = arg4;
                            } else if (arg3) {
                                arg7[arg1] = arg0;
                            }
                            arg1++;
                        }
                        arg1 += var11;
                    }
                    return;
                }
                if (arg9 == 2) {
                    for (int var42 = arg5 - 1; var42 >= 0; var42--) {
                        for (int var43 = arg8 - 1; var43 >= 0; var43--) {
                            if (var42 - arg5 / 2 <= var43) {
                                arg7[arg1] = arg4;
                            } else if (arg3) {
                                arg7[arg1] = arg0;
                            }
                            arg1++;
                        }
                        arg1 += var11;
                    }
                    return;
                }
                if (arg9 == 3) {
                    for (int var40 = 0; var40 < arg5; var40++) {
                        for (int var41 = arg8 - 1; var41 >= 0; var41--) {
                            if (var40 - arg5 / 2 <= var41) {
                                arg7[arg1] = arg4;
                            } else if (arg3) {
                                arg7[arg1] = arg0;
                            }
                            arg1++;
                        }
                        arg1 += var11;
                    }
                    return;
                }
            }
        } else if (arg9 == 0) {
            for (int var58 = arg5 - 1; var58 >= 0; var58--) {
                for (int var59 = arg8 - 1; var59 >= 0; var59--) {
                    if (var58 >> 1 <= var59) {
                        arg7[arg1] = arg4;
                    } else if (arg3) {
                        arg7[arg1] = arg0;
                    }
                    arg1++;
                }
                arg1 += var11;
            }
        } else if (arg9 == 1) {
            for (int var56 = arg5 - 1; var56 >= 0; var56--) {
                for (int var57 = 0; var57 < arg8; var57++) {
                    if (var57 <= var56 << 1) {
                        arg7[arg1] = arg4;
                    } else if (arg3) {
                        arg7[arg1] = arg0;
                    }
                    arg1++;
                }
                arg1 += var11;
            }
        } else if (arg9 == 2) {
            for (int var52 = 0; var52 < arg5; var52++) {
                for (int var53 = 0; var53 < arg8; var53++) {
                    if (var52 >> 1 <= var53) {
                        arg7[arg1] = arg4;
                    } else if (arg3) {
                        arg7[arg1] = arg0;
                    }
                    arg1++;
                }
                arg1 += var11;
            }
        } else if (arg9 == 3) {
            for (int var54 = 0; var54 < arg5; var54++) {
                for (int var55 = arg8 - 1; var55 >= 0; var55--) {
                    if (var55 <= var54 << 1) {
                        arg7[arg1] = arg4;
                    } else if (arg3) {
                        arg7[arg1] = arg0;
                    }
                    arg1++;
                }
                arg1 += var11;
            }
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "b", descriptor = "(IIIIIIIII)V", line = 2162)
    public final void method89(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = arg0 - arg7;
        int var11 = (arg3 - arg8 << 16) / var10;
        int var12 = arg2 - arg6;
        this.field112 = 0;
        int var13 = (arg1 - arg5 << 16) / var12;
        int var14 = -98 / ((47 - arg4) / 46);
        for (int var15 = 0; var15 < var10; var15++) {
            int var16 = var11 * var15 >> 16;
            int var17 = (var15 + 1) * var11 >> 16;
            int var18 = var17 - var16;
            if (var18 > 0) {
                class29.method198((byte) 74, arg6, arg7 + var15);
                for (int var19 = 0; var19 < var12; var19++) {
                    int var20 = (var19 + 1) * var13 >> 16;
                    int var21 = var13 * var19 >> 16;
                    int var22 = var20 - var21;
                    if (var22 > 0) {
                        int var23 = class10.method57(-5265) & 0xFF;
                        if (var23 != 0) {
                            int var24;
                            if (var18 == 1) {
                                var24 = var16;
                            } else {
                                var24 = var17 - 1;
                            }
                            int var25;
                            if (var22 == 1) {
                                var25 = var21;
                            } else {
                                var25 = var20 - 1;
                            }
                            int var26 = 13421772;
                            if (var23 >= 5 && var23 <= 8 || var23 >= 13 && var23 <= 16 || var23 >= 21 && var23 <= 24 || var23 == 27 || var23 == 28) {
                                var26 = 13369344;
                                var23 -= 4;
                            }
                            if (var23 == 1) {
                                class8.method42(var16, var21, var22, var26);
                            } else if (var23 == 2) {
                                class8.method43(var16, var21, var18, var26);
                            } else if (var23 == 3) {
                                class8.method42(var24, var21, var22, var26);
                            } else if (var23 == 4) {
                                class8.method43(var16, var25, var18, var26);
                            } else if (var23 == 9) {
                                class8.method42(var16, var21, var22, 16777215);
                                class8.method43(var16, var21, var18, var26);
                            } else if (var23 == 10) {
                                class8.method42(var24, var21, var22, 16777215);
                                class8.method43(var16, var21, var18, var26);
                            } else if (var23 == 11) {
                                class8.method42(var24, var21, var22, 16777215);
                                class8.method43(var16, var25, var18, var26);
                            } else if (var23 == 12) {
                                class8.method42(var16, var21, var22, 16777215);
                                class8.method43(var16, var25, var18, var26);
                            } else if (var23 == 17) {
                                class8.method43(var16, var21, 1, var26);
                            } else if (var23 == 18) {
                                class8.method43(var24, var21, 1, var26);
                            } else if (var23 == 19) {
                                class8.method43(var24, var25, 1, var26);
                            } else if (var23 == 20) {
                                class8.method43(var16, var25, 1, var26);
                            } else if (var23 == 25) {
                                for (int var27 = 0; var27 < var22; var27++) {
                                    class8.method43(var16 + var27, -var27 + var25, 1, var26);
                                }
                            } else if (var23 == 26) {
                                for (int var28 = 0; var28 < var22; var28++) {
                                    class8.method43(var16 + var28, var21 + var28, 1, var26);
                                }
                            }
                        }
                        int var29 = class26.method178((byte) 106) & 0xFF;
                        if (var29 != 0) {
                            this.field120[this.field112] = var29 - 1;
                            this.field107[this.field112] = var18 / 2 + var16;
                            this.field113[this.field112] = var22 / 2 + var21;
                            this.field112++;
                        }
                    }
                    class35.method241(108);
                }
            }
        }
    }
}
