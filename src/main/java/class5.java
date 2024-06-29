import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!c")
public class class5 {

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "[I")
    private int[] field87 = new int[1500];

    @OriginalMember(owner = "mapview!c", name = "g", descriptor = "[I")
    private int[] field93 = new int[1500];

    @OriginalMember(owner = "mapview!c", name = "c", descriptor = "I")
    private int field89 = 0;

    @OriginalMember(owner = "mapview!c", name = "h", descriptor = "[I")
    public int[] field94 = new int[1500];

    @OriginalMember(owner = "mapview!c", name = "i", descriptor = "[I")
    public int[] field95 = new int[1500];

    @OriginalMember(owner = "mapview!c", name = "m", descriptor = "[I")
    public int[] field99 = new int[1500];

    @OriginalMember(owner = "mapview!c", name = "b", descriptor = "[I")
    private int[] field88 = new int[1500];

    @OriginalMember(owner = "mapview!c", name = "d", descriptor = "Lt;")
    public static class35 field90 = class3.method28(false, "Altar");

    @OriginalMember(owner = "mapview!c", name = "f", descriptor = "Lt;")
    public static class35 field92 = class3.method28(false, "Loom");

    @OriginalMember(owner = "mapview!c", name = "l", descriptor = "Lt;")
    public static class35 field98 = class3.method28(false, "Farming patch");

    @OriginalMember(owner = "mapview!c", name = "k", descriptor = "I")
    public static volatile int field97 = 0;

    @OriginalMember(owner = "mapview!c", name = "j", descriptor = "Lt;")
    public static class35 field96 = class3.method28(false, "Dairy Churn");

    @OriginalMember(owner = "mapview!c", name = "n", descriptor = "Lt;")
    public static class35 field100 = class3.method28(false, "Potters Wheel");

    @OriginalMember(owner = "mapview!c", name = "e", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(I)V", line = 8)
    public static void method32(int arg0) {
        field90 = null;
        field98 = null;
        field92 = null;
        field96 = null;
        if (arg0 != -887730448) {
            field98 = null;
        }
        field100 = null;
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(III)V", line = 23)
    private final void method33(int arg0, int arg1, int arg2) {
        int var4 = arg2 >> arg0;
        int var5 = arg1 >> 6;
        class19.field223[0] = new byte[var5][var4][];
        class19.field223[1] = new byte[var5][var4][];
        class19.field223[2] = new byte[var5][var4][];
        class19.field223[3] = new byte[var5][var4][];
        class19.field223[4] = new byte[var5][var4][];
        class11.field155 = new class6[var5][var4];
        mapview.field52 = new int[var5][var4][];
        class34.field422 = new class6[var5][var4];
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(IIIIIIIBI)V", line = 40)
    public final void method34(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        this.field89 = 0;
        int var10 = arg0 - arg3;
        int var11 = arg6 - arg1;
        if (arg7 <= 90) {
            this.method35(-70, 55, -53, false, 101, -39, -38, -124, 14);
        }
        int var12 = (arg4 - arg2 << 16) / var10;
        int var13 = (arg8 - arg5 << 16) / var11;
        for (int var14 = 0; var14 < var10; var14++) {
            int var15 = var12 * var14 >> 16;
            int var16 = (var14 + 1) * var12 >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                class32.method189((byte) -98, arg3 + var14, arg1);
                for (int var18 = 0; var18 < var11; var18++) {
                    int var19 = var13 * var18 >> 16;
                    int var20 = (var18 + 1) * var13 >> 16;
                    int var21 = var20 - var19;
                    if (var21 > 0) {
                        int var22 = class32.method187(true) & 0xFF;
                        if (var22 != 0) {
                            int var23;
                            if (var17 == 1) {
                                var23 = var15;
                            } else {
                                var23 = var16 - 1;
                            }
                            int var24 = 13421772;
                            int var25;
                            if (var21 == 1) {
                                var25 = var19;
                            } else {
                                var25 = var20 - 1;
                            }
                            if (var22 >= 5 && var22 <= 8 || var22 >= 13 && var22 <= 16 || var22 >= 21 && var22 <= 24 || var22 == 27 || var22 == 28) {
                                var24 = 13369344;
                                var22 -= 4;
                            }
                            if (var22 == 1) {
                                class37.method235(var15, var19, var21, var24);
                            } else if (var22 == 2) {
                                class37.method237(var15, var19, var17, var24);
                            } else if (var22 == 3) {
                                class37.method235(var23, var19, var21, var24);
                            } else if (var22 == 4) {
                                class37.method237(var15, var25, var17, var24);
                            } else if (var22 == 9) {
                                class37.method235(var15, var19, var21, 16777215);
                                class37.method237(var15, var19, var17, var24);
                            } else if (var22 == 10) {
                                class37.method235(var23, var19, var21, 16777215);
                                class37.method237(var15, var19, var17, var24);
                            } else if (var22 == 11) {
                                class37.method235(var23, var19, var21, 16777215);
                                class37.method237(var15, var25, var17, var24);
                            } else if (var22 == 12) {
                                class37.method235(var15, var19, var21, 16777215);
                                class37.method237(var15, var25, var17, var24);
                            } else if (var22 == 17) {
                                class37.method237(var15, var19, 1, var24);
                            } else if (var22 == 18) {
                                class37.method237(var23, var19, 1, var24);
                            } else if (var22 == 19) {
                                class37.method237(var23, var25, 1, var24);
                            } else if (var22 == 20) {
                                class37.method237(var15, var25, 1, var24);
                            } else if (var22 == 25) {
                                for (int var27 = 0; var27 < var21; var27++) {
                                    class37.method237(var15 + var27, -var27 + var25, 1, var24);
                                }
                            } else if (var22 == 26) {
                                for (int var26 = 0; var26 < var21; var26++) {
                                    class37.method237(var15 + var26, var19 + var26, 1, var24);
                                }
                            }
                        }
                        int var28 = class19.method116(-104) & 0xFF;
                        if (var28 != 0) {
                            this.field88[this.field89] = var28 - 1;
                            this.field93[this.field89] = var17 / 2 + var15;
                            this.field87[this.field89] = var21 / 2 + var19;
                            this.field89++;
                        }
                    }
                    class29.method167(-128);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(IIIZIIIII)V", line = 223)
    public final void method35(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = arg6 - arg4;
        int var11 = arg0 - arg8;
        int var12 = (arg5 - arg2 << 16) / var10;
        int var13 = (arg7 - arg1 << 16) / var11;
        for (int var14 = 0; var14 < var11; var14++) {
            int var15 = var13 * var14 >> 16;
            int var16 = (var14 + 1) * var13 >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                int var18 = arg1 + var16;
                int var19 = arg1 + var15;
                class32.method189((byte) -98, var14 + arg8, arg4);
                for (int var20 = 0; var20 < var10; var20++) {
                    int var21 = var12 * var20 >> 16;
                    int var22 = (var20 + 1) * var12 >> 16;
                    int var23 = var22 - var21;
                    if (var23 > 0) {
                        int var24 = arg2 + var22;
                        int var25 = class24.method135((byte) 7);
                        int var26 = arg2 + var21;
                        int var27 = class23.method133((byte) -127);
                        if (var25 == 0 && var27 == 0) {
                            class37.method242(var19, var26, var18 - var19, var24 - var26, class11.method81(true));
                        } else {
                            byte var28 = class29.method168((byte) 82);
                            int var29 = var28 & 0xFC;
                            if (var29 == 0 || var17 <= 1 || var23 <= 1) {
                                class37.method242(var19, var26, var17, var23, var25);
                            } else {
                                this.method41(var28 & 0x3, class37.field456, class11.method81(true), true, -64, var25, class37.field460 * var26 + var19, var17, var29 >> 2, var23);
                            }
                            if (var27 > 0) {
                                byte var30 = class34.method203(0);
                                int var31 = var30 & 0xFC;
                                if (var31 == 0 || var17 <= 1 || var23 <= 1) {
                                    class37.method242(var19, var26, var17, var23, var27);
                                }
                                this.method41(var30 & 0x3, class37.field456, class11.method81(true), var25 == 0, -87, var27, class37.field460 * var26 + var19, var17, var31 >> 2, var23);
                            }
                        }
                    }
                    class29.method167(-124);
                }
            }
        }
        if (arg3) {
            field96 = null;
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "([BZ)V", line = 320)
    private final void method36(byte[] arg0, boolean arg1) {
        int var3 = 0;
        while (true) {
            while (arg0.length > var3) {
                int var4 = (arg0[var3++] & 0xFF) * 64 - class23.field255;
                int var5 = (arg0[var3++] & 0xFF) * 64 - class30.field358;
                if (var4 > 0 && var5 > 0 && class31.field374 > var4 + 64 && class33.field408 > var5 + 64) {
                    class16.field183 = class33.field408 - var5 - 1 >> 6;
                    class19.field220 = var4 >> 6;
                    for (int var6 = 0; var6 < 64; var6++) {
                        for (int var7 = -64; var7 < 0; var7++) {
                            int var8 = arg0[var3++] & 0xFF;
                            if (var8 != 0) {
                                byte var9 = arg0[var3++];
                                class27.method153((byte) 74, 4, var9, class33.field408 - var7 - var5 - 1 - 64, var4 + var6);
                                if (class11.field155[class16.field183][class19.field220] == null) {
                                    class11.field155[class16.field183][class19.field220] = new class6();
                                    class11.field155[class16.field183][class19.field220].field102 = new byte[4096];
                                }
                                class11.field155[class16.field183][class19.field220].field102[(-(var7 + 1) << 6) + var6] = (byte) var8;
                            }
                        }
                    }
                    if (class11.field155[class16.field183][class19.field220] != null) {
                        class11.field155[class16.field183][class19.field220].method51(true);
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
            if (arg1) {
                field90 = null;
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(Z)V", line = 403)
    public static final void method37(boolean arg0) {
        if (class10.field139.toLowerCase().indexOf("microsoft") == -1) {
            class17.field195[44] = 71;
            class17.field195[45] = 26;
            class17.field195[46] = 72;
            class17.field195[47] = 73;
            class17.field195[59] = 57;
            class17.field195[61] = 27;
            class17.field195[91] = 42;
            class17.field195[92] = 74;
            class17.field195[93] = 43;
            if (class10.field149 == null) {
                class17.field195[192] = 58;
                class17.field195[222] = 59;
            } else {
                class17.field195[192] = 28;
                class17.field195[222] = 58;
                class17.field195[520] = 59;
            }
        } else {
            class17.field195[186] = 57;
            class17.field195[187] = 27;
            class17.field195[188] = 71;
            class17.field195[189] = 26;
            class17.field195[190] = 72;
            class17.field195[191] = 73;
            class17.field195[192] = 58;
            class17.field195[219] = 42;
            class17.field195[220] = 74;
            class17.field195[221] = 43;
            class17.field195[222] = 59;
            class17.field195[223] = 28;
        }
        if (arg0) {
            method37(true);
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "([BI)V", line = 456)
    private final void method38(byte[] arg0, int arg1) {
        int var3 = 0;
        if (arg1 != 2) {
            this.method33(-29, 58, 94);
        }
        while (true) {
            while (arg0.length > var3) {
                int var4 = (arg0[var3++] & 0xFF) * 64 - class23.field255;
                int var5 = (arg0[var3++] & 0xFF) * 64 - class30.field358;
                if (var4 > 0 && var5 > 0 && class31.field374 > var4 + 64 && class33.field408 > var5 + 64) {
                    class16.field183 = class33.field408 - var5 - 1 >> 6;
                    class19.field220 = var4 >> 6;
                    for (int var6 = 0; var6 < 64; var6++) {
                        for (int var7 = -64; var7 < 0; var7++) {
                            int var8 = arg0[var3++] & 0xFF;
                            if (var8 != 0) {
                                byte var9 = arg0[var3++];
                                class27.method153((byte) -64, 3, var9, class33.field408 - var5 - var7 - 64 - 1, var4 + var6);
                                if (class34.field422[class16.field183][class19.field220] == null) {
                                    class34.field422[class16.field183][class19.field220] = new class6();
                                    class34.field422[class16.field183][class19.field220].field102 = new byte[4096];
                                }
                                class34.field422[class16.field183][class19.field220].field102[(-(var7 + 1) << 6) + var6] = (byte) var8;
                            }
                        }
                    }
                    if (class34.field422[class16.field183][class19.field220] != null) {
                        class34.field422[class16.field183][class19.field220].method51(true);
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

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "([[BI)V", line = 538)
    private final void method39(byte[][] arg0, int arg1) {
        int var3 = class33.field408;
        int var4 = class31.field374;
        int[] var5 = new int[var3];
        int var6 = 0;
        int var7 = 92 % ((43 - arg1) / 51);
        while (var3 > var6) {
            var5[var6] = 0;
            var6++;
        }
        for (int var8 = 5; var8 < var4 - 5; var8++) {
            byte[] var9 = arg0[var8 + 5];
            byte[] var10 = arg0[var8 - 5];
            for (int var11 = 0; var11 < var3; var11++) {
                int var12 = class18.field211[var9[var11] & 0xFF];
                int var13 = class18.field211[var10[var11] & 0xFF];
                if (var12 <= 0 && class8.method57(var8 + 5, var11, true) > 0) {
                    var12 = 64;
                }
                if (var13 <= 0 && class8.method57(var8 - 5, var11, true) > 0) {
                    var13 = 64;
                }
                var5[var11] += var12 - var13;
            }
            if (var8 > 10 && var8 < var4 - 10) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 5; var17 < var3 - 5; var17++) {
                    int var18 = var5[var17 - 5];
                    int var19 = var5[var17 + 5];
                    var14 += (var19 & 0x3FF) - (var18 & 0x3FF);
                    var16 += (var19 >> 10 & 0x3FF) - (var18 >> 10 & 0x3FF);
                    var15 += (var19 >> 20) - (var18 >> 20);
                    if (var14 > 0) {
                        int var20 = var8 >> 6;
                        int var21 = var17 >> 6;
                        if (mapview.field52[var21][var20] == null) {
                            mapview.field52[var21][var20] = new int[4096];
                        }
                        if ((arg0[var8][var17] & 0xFF) <= 0) {
                            mapview.field52[var21][var20][mapview.method15(var17 << 6, 4032) + mapview.method15(var8, 63)] = 0;
                        } else {
                            mapview.field52[var21][var20][mapview.method15(var17 << 6, 4032) + mapview.method15(63, var8)] = this.method40((double) var15 / 8533.0D, (double) var14 / 8533.0D, (double) var16 / 8533.0D, 30193);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(DDDI)I", line = 644)
    private final int method40(double arg0, double arg1, double arg2, int arg3) {
        if (arg3 != 30193) {
            field98 = null;
        }
        double var8 = arg1;
        double var10 = arg1;
        double var12 = arg1;
        if (arg2 != 0.0D) {
            double var14;
            if (arg1 < 0.5D) {
                var14 = (arg2 + 1.0D) * arg1;
            } else {
                var14 = arg1 + arg2 - arg1 * arg2;
            }
            double var16 = arg0 + 0.3333333333333333D;
            if (var16 > 1.0D) {
                var16--;
            }
            double var18 = arg0 - 0.3333333333333333D;
            double var22 = arg1 * 2.0D - var14;
            if (var18 < 0.0D) {
                var18++;
            }
            if (var16 * 6.0D < 1.0D) {
                var8 = (var14 - var22) * 6.0D * var16 + var22;
            } else if (var16 * 2.0D < 1.0D) {
                var8 = var14;
            } else if (var16 * 3.0D < 2.0D) {
                var8 = (0.6666666666666666D - var16) * (-var22 + var14) * 6.0D + var22;
            } else {
                var8 = var22;
            }
            if (arg0 * 6.0D < 1.0D) {
                var10 = (var14 - var22) * 6.0D * arg0 + var22;
            } else if (arg0 * 2.0D < 1.0D) {
                var10 = var14;
            } else if (arg0 * 3.0D < 2.0D) {
                var10 = (var14 - var22) * (0.6666666666666666D - arg0) * 6.0D + var22;
            } else {
                var10 = var22;
            }
            if (var18 * 6.0D < 1.0D) {
                var12 = (var14 - var22) * 6.0D * var18 + var22;
            } else if (var18 * 2.0D < 1.0D) {
                var12 = var14;
            } else if (var18 * 3.0D < 2.0D) {
                var12 = (var14 - var22) * (0.6666666666666666D - var18) * 6.0D + var22;
            } else {
                var12 = var22;
            }
        }
        int var24 = (int) (var8 * 256.0D);
        int var25 = (int) (var12 * 256.0D);
        int var26 = (int) (var10 * 256.0D);
        return (var24 << 16) + ((var26 << 8) + var25);
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(I[IIZIIIIII)V", line = 740)
    private final void method41(int arg0, int[] arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg8 == 9) {
            arg8 = 1;
            arg0 = arg0 + 1 & 0x3;
        }
        if (arg8 == 10) {
            arg8 = 1;
            arg0 = arg0 + 3 & 0x3;
        }
        if (arg8 == 11) {
            arg8 = 8;
            arg0 = arg0 + 3 & 0x3;
        }
        int var11 = class37.field460 - arg7;
        if (arg8 == 1) {
            if (arg0 == 0) {
                for (int var18 = 0; var18 < arg9; var18++) {
                    for (int var19 = 0; var19 < arg7; var19++) {
                        if (var19 <= var18) {
                            arg1[arg6] = arg5;
                        } else if (arg3) {
                            arg1[arg6] = arg2;
                        }
                        arg6++;
                    }
                    arg6 += var11;
                }
            } else if (arg0 == 1) {
                for (int var12 = arg9 - 1; var12 >= 0; var12--) {
                    for (int var13 = 0; var13 < arg7; var13++) {
                        if (var12 >= var13) {
                            arg1[arg6] = arg5;
                        } else if (arg3) {
                            arg1[arg6] = arg2;
                        }
                        arg6++;
                    }
                    arg6 += var11;
                }
            } else if (arg0 == 2) {
                for (int var14 = 0; var14 < arg9; var14++) {
                    for (int var15 = 0; var15 < arg7; var15++) {
                        if (var15 >= var14) {
                            arg1[arg6] = arg5;
                        } else if (arg3) {
                            arg1[arg6] = arg2;
                        }
                        arg6++;
                    }
                    arg6 += var11;
                }
            } else if (arg0 == 3) {
                for (int var16 = arg9 - 1; var16 >= 0; var16--) {
                    for (int var17 = 0; var17 < arg7; var17++) {
                        if (var17 >= var16) {
                            arg1[arg6] = arg5;
                        } else if (arg3) {
                            arg1[arg6] = arg2;
                        }
                        arg6++;
                    }
                    arg6 += var11;
                }
            }
        } else if (arg8 == 2) {
            if (arg0 == 0) {
                for (int var74 = arg9 - 1; var74 >= 0; var74--) {
                    for (int var75 = 0; var75 < arg7; var75++) {
                        if (var74 >> 1 >= var75) {
                            arg1[arg6] = arg5;
                        } else if (arg3) {
                            arg1[arg6] = arg2;
                        }
                        arg6++;
                    }
                    arg6 += var11;
                }
            } else if (arg0 == 1) {
                for (int var72 = 0; var72 < arg9; var72++) {
                    for (int var73 = 0; var73 < arg7; var73++) {
                        if (var72 << 1 <= var73) {
                            arg1[arg6] = arg5;
                        } else if (arg3) {
                            arg1[arg6] = arg2;
                        }
                        arg6++;
                    }
                    arg6 += var11;
                }
            } else if (arg0 == 2) {
                for (int var70 = 0; var70 < arg9; var70++) {
                    for (int var71 = arg7 - 1; var71 >= 0; var71--) {
                        if (var70 >> 1 >= var71) {
                            arg1[arg6] = arg5;
                        } else if (arg3) {
                            arg1[arg6] = arg2;
                        }
                        arg6++;
                    }
                    arg6 += var11;
                }
            } else if (arg0 == 3) {
                for (int var68 = arg9 - 1; var68 >= 0; var68--) {
                    for (int var69 = arg7 - 1; var69 >= 0; var69--) {
                        if (var69 >= var68 << 1) {
                            arg1[arg6] = arg5;
                        } else if (arg3) {
                            arg1[arg6] = arg2;
                        }
                        arg6++;
                    }
                    arg6 += var11;
                }
            }
        } else if (arg8 == 3) {
            if (arg0 == 0) {
                for (int var26 = arg9 - 1; var26 >= 0; var26--) {
                    for (int var27 = arg7 - 1; var27 >= 0; var27--) {
                        if (var26 >> 1 >= var27) {
                            arg1[arg6] = arg5;
                        } else if (arg3) {
                            arg1[arg6] = arg2;
                        }
                        arg6++;
                    }
                    arg6 += var11;
                }
            } else if (arg0 == 1) {
                for (int var20 = arg9 - 1; var20 >= 0; var20--) {
                    for (int var21 = 0; var21 < arg7; var21++) {
                        if (var20 << 1 <= var21) {
                            arg1[arg6] = arg5;
                        } else if (arg3) {
                            arg1[arg6] = arg2;
                        }
                        arg6++;
                    }
                    arg6 += var11;
                }
            } else if (arg0 == 2) {
                for (int var24 = 0; var24 < arg9; var24++) {
                    for (int var25 = 0; var25 < arg7; var25++) {
                        if (var24 >> 1 >= var25) {
                            arg1[arg6] = arg5;
                        } else if (arg3) {
                            arg1[arg6] = arg2;
                        }
                        arg6++;
                    }
                    arg6 += var11;
                }
            } else if (arg0 == 3) {
                for (int var22 = 0; var22 < arg9; var22++) {
                    for (int var23 = arg7 - 1; var23 >= 0; var23--) {
                        if (var22 << 1 <= var23) {
                            arg1[arg6] = arg5;
                        } else if (arg3) {
                            arg1[arg6] = arg2;
                        }
                        arg6++;
                    }
                    arg6 += var11;
                }
            }
        } else if (arg8 == 4) {
            if (arg0 == 0) {
                for (int var28 = arg9 - 1; var28 >= 0; var28--) {
                    for (int var29 = 0; var29 < arg7; var29++) {
                        if (var29 >= var28 >> 1) {
                            arg1[arg6] = arg5;
                        } else if (arg3) {
                            arg1[arg6] = arg2;
                        }
                        arg6++;
                    }
                    arg6 += var11;
                }
            } else if (arg0 == 1) {
                for (int var30 = 0; var30 < arg9; var30++) {
                    for (int var31 = 0; var31 < arg7; var31++) {
                        if (var30 << 1 >= var31) {
                            arg1[arg6] = arg5;
                        } else if (arg3) {
                            arg1[arg6] = arg2;
                        }
                        arg6++;
                    }
                    arg6 += var11;
                }
            } else if (arg0 == 2) {
                for (int var34 = 0; var34 < arg9; var34++) {
                    for (int var35 = arg7 - 1; var35 >= 0; var35--) {
                        if (var34 >> 1 <= var35) {
                            arg1[arg6] = arg5;
                        } else if (arg3) {
                            arg1[arg6] = arg2;
                        }
                        arg6++;
                    }
                    arg6 += var11;
                }
            } else if (arg0 == 3) {
                for (int var32 = arg9 - 1; var32 >= 0; var32--) {
                    for (int var33 = arg7 - 1; var33 >= 0; var33--) {
                        if (var32 << 1 >= var33) {
                            arg1[arg6] = arg5;
                        } else if (arg3) {
                            arg1[arg6] = arg2;
                        }
                        arg6++;
                    }
                    arg6 += var11;
                }
            }
        } else if (arg8 != 5) {
            if (arg8 == 6) {
                if (arg0 == 0) {
                    for (int var44 = 0; var44 < arg9; var44++) {
                        for (int var45 = 0; var45 < arg7; var45++) {
                            if (var45 <= arg7 / 2) {
                                arg1[arg6] = arg5;
                            } else if (arg3) {
                                arg1[arg6] = arg2;
                            }
                            arg6++;
                        }
                        arg6 += var11;
                    }
                    return;
                }
                if (arg0 == 1) {
                    for (int var50 = 0; var50 < arg9; var50++) {
                        for (int var51 = 0; var51 < arg7; var51++) {
                            if (arg9 / 2 >= var50) {
                                arg1[arg6] = arg5;
                            } else if (arg3) {
                                arg1[arg6] = arg2;
                            }
                            arg6++;
                        }
                        arg6 += var11;
                    }
                    return;
                }
                if (arg0 == 2) {
                    for (int var46 = 0; var46 < arg9; var46++) {
                        for (int var47 = 0; var47 < arg7; var47++) {
                            if (arg7 / 2 <= var47) {
                                arg1[arg6] = arg5;
                            } else if (arg3) {
                                arg1[arg6] = arg2;
                            }
                            arg6++;
                        }
                        arg6 += var11;
                    }
                    return;
                }
                if (arg0 == 3) {
                    for (int var48 = 0; var48 < arg9; var48++) {
                        for (int var49 = 0; var49 < arg7; var49++) {
                            if (var48 >= arg9 / 2) {
                                arg1[arg6] = arg5;
                            } else if (arg3) {
                                arg1[arg6] = arg2;
                            }
                            arg6++;
                        }
                        arg6 += var11;
                    }
                    return;
                }
            }
            if (arg8 == 7) {
                if (arg0 == 0) {
                    for (int var58 = 0; var58 < arg9; var58++) {
                        for (int var59 = 0; var59 < arg7; var59++) {
                            if (var59 <= var58 - arg9 / 2) {
                                arg1[arg6] = arg5;
                            } else if (arg3) {
                                arg1[arg6] = arg2;
                            }
                            arg6++;
                        }
                        arg6 += var11;
                    }
                    return;
                }
                if (arg0 == 1) {
                    for (int var56 = arg9 - 1; var56 >= 0; var56--) {
                        for (int var57 = 0; var57 < arg7; var57++) {
                            if (var56 - arg9 / 2 >= var57) {
                                arg1[arg6] = arg5;
                            } else if (arg3) {
                                arg1[arg6] = arg2;
                            }
                            arg6++;
                        }
                        arg6 += var11;
                    }
                    return;
                }
                if (arg0 == 2) {
                    for (int var54 = arg9 - 1; var54 >= 0; var54--) {
                        for (int var55 = arg7 - 1; var55 >= 0; var55--) {
                            if (var54 - arg9 / 2 >= var55) {
                                arg1[arg6] = arg5;
                            } else if (arg3) {
                                arg1[arg6] = arg2;
                            }
                            arg6++;
                        }
                        arg6 += var11;
                    }
                    return;
                }
                if (arg0 == 3) {
                    for (int var52 = 0; var52 < arg9; var52++) {
                        for (int var53 = arg7 - 1; var53 >= 0; var53--) {
                            if (var53 <= var52 - arg9 / 2) {
                                arg1[arg6] = arg5;
                            } else if (arg3) {
                                arg1[arg6] = arg2;
                            }
                            arg6++;
                        }
                        arg6 += var11;
                    }
                    return;
                }
            }
            if (arg8 == 8) {
                if (arg0 == 0) {
                    for (int var66 = 0; var66 < arg9; var66++) {
                        for (int var67 = 0; var67 < arg7; var67++) {
                            if (var67 >= var66 - arg9 / 2) {
                                arg1[arg6] = arg5;
                            } else if (arg3) {
                                arg1[arg6] = arg2;
                            }
                            arg6++;
                        }
                        arg6 += var11;
                    }
                    return;
                }
                if (arg0 == 1) {
                    for (int var64 = arg9 - 1; var64 >= 0; var64--) {
                        for (int var65 = 0; var65 < arg7; var65++) {
                            if (var64 - arg9 / 2 <= var65) {
                                arg1[arg6] = arg5;
                            } else if (arg3) {
                                arg1[arg6] = arg2;
                            }
                            arg6++;
                        }
                        arg6 += var11;
                    }
                    return;
                }
                if (arg0 == 2) {
                    for (int var60 = arg9 - 1; var60 >= 0; var60--) {
                        for (int var61 = arg7 - 1; var61 >= 0; var61--) {
                            if (var61 >= var60 - arg9 / 2) {
                                arg1[arg6] = arg5;
                            } else if (arg3) {
                                arg1[arg6] = arg2;
                            }
                            arg6++;
                        }
                        arg6 += var11;
                    }
                    return;
                }
                if (arg0 == 3) {
                    for (int var62 = 0; var62 < arg9; var62++) {
                        for (int var63 = arg7 - 1; var63 >= 0; var63--) {
                            if (var62 - arg9 / 2 <= var63) {
                                arg1[arg6] = arg5;
                            } else if (arg3) {
                                arg1[arg6] = arg2;
                            }
                            arg6++;
                        }
                        arg6 += var11;
                    }
                    return;
                }
            }
            if (arg4 >= -22) {
                field91 = -57;
            }
        } else if (arg0 == 0) {
            for (int var36 = arg9 - 1; var36 >= 0; var36--) {
                for (int var37 = arg7 - 1; var37 >= 0; var37--) {
                    if (var37 >= var36 >> 1) {
                        arg1[arg6] = arg5;
                    } else if (arg3) {
                        arg1[arg6] = arg2;
                    }
                    arg6++;
                }
                arg6 += var11;
            }
        } else if (arg0 == 1) {
            for (int var42 = arg9 - 1; var42 >= 0; var42--) {
                for (int var43 = 0; var43 < arg7; var43++) {
                    if (var42 << 1 >= var43) {
                        arg1[arg6] = arg5;
                    } else if (arg3) {
                        arg1[arg6] = arg2;
                    }
                    arg6++;
                }
                arg6 += var11;
            }
        } else if (arg0 == 2) {
            for (int var38 = 0; var38 < arg9; var38++) {
                for (int var39 = 0; var39 < arg7; var39++) {
                    if (var39 >= var38 >> 1) {
                        arg1[arg6] = arg5;
                    } else if (arg3) {
                        arg1[arg6] = arg2;
                    }
                    arg6++;
                }
                arg6 += var11;
            }
        } else if (arg0 == 3) {
            for (int var40 = 0; var40 < arg9; var40++) {
                for (int var41 = arg7 - 1; var41 >= 0; var41--) {
                    if (var41 <= var40 << 1) {
                        arg1[arg6] = arg5;
                    } else if (arg3) {
                        arg1[arg6] = arg2;
                    }
                    arg6++;
                }
                arg6 += var11;
            }
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(IIIIIDIIII)V", line = 1889)
    public final void method42(int arg0, int arg1, int arg2, int arg3, int arg4, double arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg1 <= 34) {
            this.method48(null, true);
        }
        int var12 = arg6 - arg2;
        int var13 = (arg3 - arg4 << 16) / var12;
        int var14 = arg8 - arg7;
        int var15 = (arg9 - arg0 << 16) / var14;
        if (arg6 - arg2 > -arg4 + arg3) {
            return;
        }
        this.field89 = 0;
        for (int var16 = 0; var16 < var12; var16++) {
            int var17 = var13 * var16 >> 16;
            int var18 = (var16 + 1) * var13 >> 16;
            int var19 = var18 - var17;
            if (var19 > 0) {
                class32.method189((byte) -98, var16 + arg2, arg7);
                for (int var20 = 0; var20 < var14; var20++) {
                    int var21 = var15 * var20 >> 16;
                    int var22 = (var20 + 1) * var15 >> 16;
                    int var23 = var22 - var21;
                    if (var23 > 0) {
                        int var24 = class26.method147(false) & 0xFF;
                        if (var24 != 0) {
                            if (var24 == 47 || var24 == 53) {
                                if (!(arg5 < 4.0D) && arg5 > 4.2D && arg5 > 6.2D) {
                                }
                                class18.field213[var24 - 1].method122(var17, var21, var19 * 2 + 1, var23 * 2 - -1);
                            } else {
                                class18.field213[var24 - 1].method122(var17 - var19 / 2, -(var23 / 2) + var21, var19 * 2, var23 * 2);
                            }
                        }
                    }
                    class29.method167(-128);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(B)Lma;", line = 2010)
    public static final class25 method43(byte arg0) {
        if (arg0 <= 11) {
            method32(-100);
        }
        class25 var1 = new class25(class30.field341, class36.field448, class2.field67, class24.field275, class13.field174);
        class18.method115(-1);
        return var1;
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(IIIIIIIIIII)V", line = 2037)
    public final void method44(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (~this.field89 == arg3) {
            int var12 = arg5 - arg10;
            int var13 = arg6 - arg8;
            int var14 = (arg0 - arg2 << 16) / var12;
            int var15 = (arg4 - arg7 << 16) / var13;
            for (int var16 = 0; var16 < var12; var16++) {
                int var17 = (var16 + 1) * var14 >> 16;
                int var18 = var14 * var16 >> 16;
                int var19 = var17 - var18;
                if (var19 > 0) {
                    class32.method189((byte) -98, arg10 + var16, arg8);
                    for (int var20 = 0; var20 < var13; var20++) {
                        int var21 = var15 * var20 >> 16;
                        int var22 = (var20 + 1) * var15 >> 16;
                        int var23 = var22 - var21;
                        if (var23 > 0) {
                            int var24 = class19.method116(-9) & 0xFF;
                            if (var24 != 0) {
                                this.field88[this.field89] = var24 - 1;
                                this.field93[this.field89] = var18 + var19 / 2;
                                this.field87[this.field89] = var23 / 2 + var21;
                                this.field89++;
                            }
                        }
                        class29.method167(-128);
                    }
                }
            }
        }
        for (int var25 = 0; var25 < this.field89; var25++) {
            if (class29.field328[this.field88[var25]] != null) {
                class29.field328[this.field88[var25]].method127(this.field93[var25] - 7, this.field87[var25] + -7);
            }
        }
        if (arg9 > 0) {
            for (int var26 = 0; var26 < this.field89; var26++) {
                if (this.field88[var26] == arg1) {
                    class29.field328[this.field88[var26]].method127(this.field93[var26] - 7, this.field87[var26] + -7);
                    if (arg9 % 10 < 5) {
                        class37.method232(this.field93[var26], this.field87[var26], 15, 16776960, 128);
                        class37.method232(this.field93[var26], this.field87[var26], 7, 16777215, 256);
                    }
                }
            }
        }
        this.field89 = 0;
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(I[B)V", line = 2151)
    private final void method45(int arg0, byte[] arg1) {
        int var3 = 0;
        if (arg0 != -14338) {
            method37(false);
        }
        while (true) {
            while (var3 < arg1.length) {
                int var4 = (arg1[var3++] & 0xFF) * 64 - class23.field255;
                int var5 = (arg1[var3++] & 0xFF) * 64 - class30.field358;
                if (var4 > 0 && var5 > 0 && var4 + 64 < class31.field374 && var5 + 64 < class33.field408) {
                    for (int var6 = 0; var6 < 64; var6++) {
                        int var7 = class33.field408 - var5 - 1;
                        for (int var8 = -64; var8 < 0; var8++) {
                            while (true) {
                                int var9 = arg1[var3++] & 0xFF;
                                if (var9 == 0) {
                                    break;
                                }
                                if (var9 < 29) {
                                    class27.method153((byte) -69, 0, (byte) var9, class33.field408 - var5 - var8 - 64 - 1, var4 - -var6);
                                } else if (var9 >= 160) {
                                    class27.method153((byte) -72, 2, (byte) (var9 - 159), class33.field408 - var8 - var5 - 64 - 1, var4 + var6);
                                    if (class17.field198 >= 1500) {
                                        break;
                                    }
                                    this.field95[class17.field198] = var6 + var4;
                                    this.field94[class17.field198] = var7;
                                    this.field99[class17.field198] = var9 - 160;
                                    class17.field198++;
                                } else {
                                    class27.method153((byte) 81, 1, (byte) (var9 - 28), class33.field408 - var8 - var5 - 1 - 64, var4 + var6);
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

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(Lt;Lt;ILpa;)[Ll;", line = 2263)
    public static final class22[] method46(class35 arg0, class35 arg1, int arg2, class31 arg3) {
        int var4 = arg3.method173(arg1, arg2 - 32344);
        int var5 = arg3.method176(var4, true, arg0);
        if (arg2 != 405) {
            method43((byte) 8);
        }
        return class11.method79(arg3, var4, -29243, var5);
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "([[B[BB)V", line = 2276)
    private final void method47(byte[][] arg0, byte[] arg1, byte arg2) {
        int var4 = 0;
        while (true) {
            while (var4 < arg1.length) {
                int var5 = (arg1[var4++] & 0xFF) * 64 - class23.field255;
                int var6 = (arg1[var4++] & 0xFF) * 64 - class30.field358;
                if (var5 > 0 && var6 > 0 && var5 + 64 < class31.field374 && class33.field408 > var6 + 64) {
                    for (int var7 = 0; var7 < 64; var7++) {
                        int var8 = class33.field408 - var6 - 1;
                        byte[] var9 = arg0[var5 + var7];
                        for (int var10 = -64; var10 < 0; var10++) {
                            var9[var8--] = arg1[var4++];
                        }
                    }
                } else {
                    var4 += 4096;
                }
            }
            int var11 = -103 / ((arg2 - 11) / 48);
            return;
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(Ln;Z)V", line = 2334)
    public final void method48(class26 arg0, boolean arg1) {
        class18 var3 = new class18(arg0.method180(class33.field418, (byte) -105, class2.field69));
        int var4 = var3.method113((byte) 121);
        int var5 = var3.method113((byte) -122);
        int var6 = var3.method113((byte) 126);
        int var7 = var3.method113((byte) -106);
        int var8 = var3.method113((byte) 43);
        int var9 = var3.method113((byte) 124);
        var3.method114(-1);
        class23.field255 = var4 * 64;
        class30.field358 = var5 * 64;
        class19.field225 = var8 * 64 - class23.field255;
        class31.field374 = (var6 - var4) * 64 + 64;
        class33.field408 = (var7 - var5) * 64 + 64;
        field91 = class33.field408 + class30.field358 - var9 * 64;
        this.method33(6, class33.field408, class31.field374);
        class18 var10 = new class18(arg0.method180(class36.field451, (byte) -100, class2.field69));
        int var11 = var10.method113((byte) 122);
        class18.field211 = new int[var11 + 1];
        for (int var12 = 0; var12 < var11; var12++) {
            class18.field211[var12 + 1] = var10.method109((byte) 119);
        }
        int var13 = var10.method113((byte) 126);
        class23.field262 = new int[var13 + 1];
        for (int var14 = 0; var14 < var13; var14++) {
            class23.field262[var14 + 1] = var10.method109((byte) 123);
        }
        byte[] var15 = arg0.method180(class21.field246, (byte) -107, class2.field69);
        byte[][] var16 = new byte[class31.field374][class33.field408];
        this.method47(var16, var15, (byte) 72);
        byte[] var17 = arg0.method180(class8.field130, (byte) -104, class2.field69);
        this.method38(var17, 2);
        byte[] var18 = arg0.method180(class33.field409, (byte) -117, class2.field69);
        this.method36(var18, false);
        byte[] var19 = arg0.method180(class18.field202, (byte) -123, class2.field69);
        class17.field198 = 0;
        if (arg1) {
            this.method45(-14338, var19);
            this.method39(var16, 108);
        }
    }
}
