import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ha")
public class class16 {

    @OriginalMember(owner = "mapview!ha", name = "g", descriptor = "I")
    private int field153 = 0;

    @OriginalMember(owner = "mapview!ha", name = "h", descriptor = "[I")
    private int[] field154 = new int[1500];

    @OriginalMember(owner = "mapview!ha", name = "d", descriptor = "[I")
    public int[] field150 = new int[1500];

    @OriginalMember(owner = "mapview!ha", name = "k", descriptor = "[I")
    private int[] field157 = new int[1500];

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "[I")
    public int[] field147 = new int[1500];

    @OriginalMember(owner = "mapview!ha", name = "p", descriptor = "[I")
    public int[] field162 = new int[1500];

    @OriginalMember(owner = "mapview!ha", name = "n", descriptor = "[I")
    private int[] field160 = new int[1500];

    @OriginalMember(owner = "mapview!ha", name = "b", descriptor = "Lu;")
    public static class38 field148 = class28.method177("Platebody Shop", (byte) -84);

    @OriginalMember(owner = "mapview!ha", name = "c", descriptor = "Lu;")
    public static class38 field149 = class28.method177("Achievement Start", (byte) -84);

    @OriginalMember(owner = "mapview!ha", name = "j", descriptor = "Lu;")
    public static class38 field156 = class28.method177("sprites", (byte) -84);

    @OriginalMember(owner = "mapview!ha", name = "i", descriptor = "I")
    public static int field155 = 0;

    @OriginalMember(owner = "mapview!ha", name = "l", descriptor = "Lu;")
    public static class38 field158 = class28.method177(" ", (byte) -84);

    @OriginalMember(owner = "mapview!ha", name = "o", descriptor = "Lu;")
    public static class38 field161 = class28.method177("Farming shop", (byte) -84);

    @OriginalMember(owner = "mapview!ha", name = "e", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "mapview!ha", name = "f", descriptor = "Lp;")
    public static class31 field152;

    @OriginalMember(owner = "mapview!ha", name = "m", descriptor = "[[B")
    public static byte[][] field159;

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(I[[B)V", line = 7)
    private final void method87(int arg0, byte[][] arg1) {
        int var3 = class29.field362;
        int var4 = class10.field97;
        int[] var5 = new int[var3];
        if (arg0 != 21905) {
            method98((byte) -28);
        }
        for (int var6 = 0; var6 < var3; var6++) {
            var5[var6] = 0;
        }
        for (int var7 = 5; var7 < var4 - 5; var7++) {
            byte[] var8 = arg1[var7 + 5];
            byte[] var9 = arg1[var7 - 5];
            for (int var10 = 0; var10 < var3; var10++) {
                int var11 = class19.field189[var8[var10] & 0xFF];
                int var12 = class19.field189[var9[var10] & 0xFF];
                if (var11 <= 0 && class7.method40(var10, false, var7 + 5) > 0) {
                    var11 = 64;
                }
                if (var12 <= 0 && class7.method40(var10, false, var7 - 5) > 0) {
                    var12 = 64;
                }
                var5[var10] += var11 - var12;
            }
            if (var7 > 10 && var4 - 10 > var7) {
                int var13 = 0;
                int var14 = 0;
                int var15 = 0;
                for (int var16 = 5; var16 < var3 - 5; var16++) {
                    int var17 = var5[var16 - 5];
                    int var18 = var5[var16 + 5];
                    var14 += (var18 >> 10 & 0x3FF) - ((var17 & 0xFFD4A) >> 10);
                    var13 += (var18 >> 20) - (var17 >> 20);
                    var15 += (var18 & 0x3FF) - (var17 & 0x3FF);
                    if (var15 > 0) {
                        int var19 = var7 >> 6;
                        int var20 = var16 >> 6;
                        if (class28.field359[var20][var19] == null) {
                            class28.field359[var20][var19] = new int[4096];
                        }
                        if ((arg1[var7][var16] & 0xFF) > 0) {
                            class28.field359[var20][var19][class33.method199(var7, 63) + (class33.method199(63, var16) << 6)] = this.method92((double) var14 / 8533.0D, (byte) -105, (double) var13 / 8533.0D, (double) var15 / 8533.0D);
                        } else {
                            class28.field359[var20][var19][(class33.method199(63, var16) << 6) + class33.method199(63, var7)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(IBI)V", line = 107)
    private final void method88(int arg0, byte arg1, int arg2) {
        int var4 = arg0 >> 6;
        int var5 = arg2 >> 6;
        class24.field236 = new class32[var5][var4];
        class28.field359 = new int[var5][var4][];
        class7.field67[3] = new byte[var5][var4][];
        class7.field67[4] = new byte[var5][var4][];
        class7.field67[2] = new byte[var5][var4][];
        if (arg1 >= -7) {
            this.method99(-127, null);
        }
        class7.field67[0] = new byte[var5][var4][];
        class7.field67[1] = new byte[var5][var4][];
        class10.field95 = new class32[var5][var4];
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(IIIIIIIII)V", line = 138)
    public final void method89(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = arg0 - arg6;
        if (arg2 != -4) {
            field158 = null;
        }
        int var11 = (arg4 - arg5 << 16) / var10;
        int var12 = arg1 - arg3;
        int var13 = (arg7 - arg8 << 16) / var12;
        for (int var14 = 0; var14 < var10; var14++) {
            int var15 = var11 * var14 >> 16;
            int var16 = (var14 + 1) * var11 >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                int var18 = arg5 + var16;
                class31.method190(arg6 + var14, -50, arg3);
                int var19 = arg5 + var15;
                for (int var20 = 0; var20 < var12; var20++) {
                    int var21 = var13 * var20 >> 16;
                    int var22 = (var20 + 1) * var13 >> 16;
                    int var23 = var22 - var21;
                    if (var23 > 0) {
                        int var24 = arg8 + var21;
                        int var25 = arg8 + var22;
                        int var26 = class8.method43((byte) -67);
                        int var27 = mapview.method156(0);
                        if (var26 == 0 && var27 == 0) {
                            class40.method255(var19, var24, var18 - var19, -var24 + var25, class29.method179((byte) 127));
                        } else {
                            byte var28 = class28.method178(88);
                            int var29 = var28 & 0xFC;
                            if (var29 == 0 || var17 <= 1 || var23 <= 1) {
                                class40.method255(var19, var24, var17, var23, var26);
                            } else {
                                this.method93(class40.field518 * var24 + var19, var28 & 0x3, class29.method179((byte) 126), class40.field515, var23, var17, true, var29 >> 2, var26, 11465);
                            }
                            if (var27 > 0) {
                                byte var30 = class31.method189(-119);
                                int var31 = var30 & 0xFC;
                                if (var31 == 0 || var17 <= 1 || var23 <= 1) {
                                    class40.method255(var19, var24, var17, var23, var27);
                                }
                                this.method93(class40.field518 * var24 + var19, var30 & 0x3, class29.method179((byte) 127), class40.field515, var23, var17, var26 == 0, var31 >> 2, var27, 11465);
                            }
                        }
                    }
                    class26.method150(true);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "([BI)V", line = 231)
    private final void method90(byte[] arg0, int arg1) {
        int var3 = arg1;
        while (true) {
            while (var3 < arg0.length) {
                int var4 = (arg0[var3++] & 0xFF) * 64 - class33.field412;
                int var5 = (arg0[var3++] & 0xFF) * 64 - class24.field229;
                if (var4 > 0 && var5 > 0 && var4 + 64 < class10.field97 && class29.field362 > var5 + 64) {
                    for (int var6 = 0; var6 < 64; var6++) {
                        int var7 = class29.field362 - var5 - 1;
                        for (int var8 = -64; var8 < 0; var8++) {
                            while (true) {
                                int var9 = arg0[var3++] & 0xFF;
                                if (var9 == 0) {
                                    break;
                                }
                                if (var9 < 29) {
                                    class37.method214(var4 + var6, 0, -151005338, (byte) var9, class29.field362 - var5 - var8 - 1 - 64);
                                } else if (var9 < 160) {
                                    class37.method214(var4 + var6, 1, -151005338, (byte) (var9 - 28), class29.field362 - var5 - var8 - 65);
                                } else {
                                    class37.method214(var4 + var6, 2, arg1 - 151005338, (byte) (var9 + -159), class29.field362 - var5 - var8 - 64 - 1);
                                    if (class17.field169 >= 1500) {
                                        break;
                                    }
                                    this.field162[class17.field169] = var4 + var6;
                                    this.field147[class17.field169] = var7;
                                    this.field150[class17.field169] = var9 - 160;
                                    class17.field169++;
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

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(IIIDIIIIII)V", line = 342)
    public final void method91(int arg0, int arg1, int arg2, double arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var12 = arg4 - arg2;
        int var13 = arg0 - arg6;
        int var14 = (arg9 - arg5 << 16) / var13;
        if (arg8 != -28070) {
            method98((byte) 64);
        }
        int var15 = (arg1 - arg7 << 16) / var12;
        if (arg1 - arg7 < -arg2 + arg4) {
            return;
        }
        this.field153 = 0;
        for (int var16 = 0; var16 < var12; var16++) {
            int var17 = var15 * var16 >> 16;
            int var18 = (var16 + 1) * var15 >> 16;
            int var19 = var18 - var17;
            if (var19 > 0) {
                class31.method190(arg2 + var16, -128, arg6);
                for (int var20 = 0; var20 < var13; var20++) {
                    int var21 = (var20 + 1) * var14 >> 16;
                    int var22 = var14 * var20 >> 16;
                    int var23 = var21 - var22;
                    if (var23 > 0) {
                        int var24 = class3.method25(-1) & 0xFF;
                        if (var24 != 0) {
                            if (var24 == 47 || var24 == 53) {
                                class1.field4[var24 - 1].method31(var17, var22, var19 * 2 + 1, var23 * 2 - -1);
                                if (!(arg3 < 4.0D) && arg3 > 4.2D && !(arg3 > 6.2D)) {
                                }
                            } else {
                                class1.field4[var24 - 1].method31(var17 - var19 / 2, var22 - var23 / 2, var19 * 2, var23 * 2);
                            }
                        }
                    }
                    class26.method150(true);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(DBDD)I", line = 463)
    private final int method92(double arg0, byte arg1, double arg2, double arg3) {
        if (arg1 >= -78) {
            this.method97(-53, -89, -123, (byte) -53, -23, -105, 38, -27, 87, -43, -68);
        }
        double var8 = arg3;
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
            if (arg2 * 6.0D < 1.0D) {
                var10 = (var14 - var16) * 6.0D * arg2 + var16;
            } else if (arg2 * 2.0D < 1.0D) {
                var10 = var14;
            } else if (arg2 * 3.0D < 2.0D) {
                var10 = (var14 - var16) * (-arg2 + 0.6666666666666666D) * 6.0D + var16;
            } else {
                var10 = var16;
            }
            double var20 = arg2 + 0.3333333333333333D;
            double var22 = arg2 - 0.3333333333333333D;
            if (var22 < 0.0D) {
                var22++;
            }
            if (var22 * 6.0D < 1.0D) {
                var12 = (var14 - var16) * 6.0D * var22 + var16;
            } else if (var22 * 2.0D < 1.0D) {
                var12 = var14;
            } else if (var22 * 3.0D < 2.0D) {
                var12 = (0.6666666666666666D - var22) * (-var16 + var14) * 6.0D + var16;
            } else {
                var12 = var16;
            }
            if (var20 > 1.0D) {
                var20--;
            }
            if (var20 * 6.0D < 1.0D) {
                var8 = (var14 - var16) * 6.0D * var20 + var16;
            } else if (var20 * 2.0D < 1.0D) {
                var8 = var14;
            } else if (var20 * 3.0D < 2.0D) {
                var8 = (var14 - var16) * (-var20 + 0.6666666666666666D) * 6.0D + var16;
            } else {
                var8 = var16;
            }
        }
        int var24 = (int) (var10 * 256.0D);
        int var25 = (int) (var8 * 256.0D);
        int var26 = (int) (var12 * 256.0D);
        return (var25 << 16) + (var24 << 8) + var26;
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(III[IIIZIII)V", line = 558)
    private final void method93(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        int var11 = class40.field518 - arg5;
        if (arg7 == 9) {
            arg1 = arg1 + 1 & 0x3;
            arg7 = 1;
        }
        if (arg7 == 10) {
            arg1 = arg1 + 3 & 0x3;
            arg7 = 1;
        }
        if (arg7 == 11) {
            arg1 = arg1 + 3 & 0x3;
            arg7 = 8;
        }
        if (arg9 != 11465) {
            this.field150 = null;
        }
        if (arg7 == 1) {
            if (arg1 == 0) {
                for (int var74 = 0; var74 < arg4; var74++) {
                    for (int var75 = 0; var75 < arg5; var75++) {
                        if (var74 >= var75) {
                            arg3[arg0] = arg8;
                        } else if (arg6) {
                            arg3[arg0] = arg2;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg1 == 1) {
                for (int var68 = arg4 - 1; var68 >= 0; var68--) {
                    for (int var69 = 0; var69 < arg5; var69++) {
                        if (var68 >= var69) {
                            arg3[arg0] = arg8;
                        } else if (arg6) {
                            arg3[arg0] = arg2;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg1 == 2) {
                for (int var72 = 0; var72 < arg4; var72++) {
                    for (int var73 = 0; var73 < arg5; var73++) {
                        if (var72 <= var73) {
                            arg3[arg0] = arg8;
                        } else if (arg6) {
                            arg3[arg0] = arg2;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg1 == 3) {
                for (int var70 = arg4 - 1; var70 >= 0; var70--) {
                    for (int var71 = 0; var71 < arg5; var71++) {
                        if (var70 <= var71) {
                            arg3[arg0] = arg8;
                        } else if (arg6) {
                            arg3[arg0] = arg2;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            }
        } else if (arg7 == 2) {
            if (arg1 == 0) {
                for (int var66 = arg4 - 1; var66 >= 0; var66--) {
                    for (int var67 = 0; var67 < arg5; var67++) {
                        if (var67 <= var66 >> 1) {
                            arg3[arg0] = arg8;
                        } else if (arg6) {
                            arg3[arg0] = arg2;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg1 == 1) {
                for (int var64 = 0; var64 < arg4; var64++) {
                    for (int var65 = 0; var65 < arg5; var65++) {
                        if (var64 << 1 <= var65) {
                            arg3[arg0] = arg8;
                        } else if (arg6) {
                            arg3[arg0] = arg2;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg1 == 2) {
                for (int var62 = 0; var62 < arg4; var62++) {
                    for (int var63 = arg5 - 1; var63 >= 0; var63--) {
                        if (var62 >> 1 >= var63) {
                            arg3[arg0] = arg8;
                        } else if (arg6) {
                            arg3[arg0] = arg2;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg1 == 3) {
                for (int var60 = arg4 - 1; var60 >= 0; var60--) {
                    for (int var61 = arg5 - 1; var61 >= 0; var61--) {
                        if (var61 >= var60 << 1) {
                            arg3[arg0] = arg8;
                        } else if (arg6) {
                            arg3[arg0] = arg2;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            }
        } else if (arg7 == 3) {
            if (arg1 == 0) {
                for (int var18 = arg4 - 1; var18 >= 0; var18--) {
                    for (int var19 = arg5 - 1; var19 >= 0; var19--) {
                        if (var19 <= var18 >> 1) {
                            arg3[arg0] = arg8;
                        } else if (arg6) {
                            arg3[arg0] = arg2;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg1 == 1) {
                for (int var12 = arg4 - 1; var12 >= 0; var12--) {
                    for (int var13 = 0; var13 < arg5; var13++) {
                        if (var12 << 1 <= var13) {
                            arg3[arg0] = arg8;
                        } else if (arg6) {
                            arg3[arg0] = arg2;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg1 == 2) {
                for (int var16 = 0; var16 < arg4; var16++) {
                    for (int var17 = 0; var17 < arg5; var17++) {
                        if (var16 >> 1 >= var17) {
                            arg3[arg0] = arg8;
                        } else if (arg6) {
                            arg3[arg0] = arg2;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg1 == 3) {
                for (int var14 = 0; var14 < arg4; var14++) {
                    for (int var15 = arg5 - 1; var15 >= 0; var15--) {
                        if (var15 >= var14 << 1) {
                            arg3[arg0] = arg8;
                        } else if (arg6) {
                            arg3[arg0] = arg2;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            }
        } else if (arg7 == 4) {
            if (arg1 == 0) {
                for (int var58 = arg4 - 1; var58 >= 0; var58--) {
                    for (int var59 = 0; var59 < arg5; var59++) {
                        if (var58 >> 1 <= var59) {
                            arg3[arg0] = arg8;
                        } else if (arg6) {
                            arg3[arg0] = arg2;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg1 == 1) {
                for (int var52 = 0; var52 < arg4; var52++) {
                    for (int var53 = 0; var53 < arg5; var53++) {
                        if (var52 << 1 >= var53) {
                            arg3[arg0] = arg8;
                        } else if (arg6) {
                            arg3[arg0] = arg2;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg1 == 2) {
                for (int var54 = 0; var54 < arg4; var54++) {
                    for (int var55 = arg5 - 1; var55 >= 0; var55--) {
                        if (var55 >= var54 >> 1) {
                            arg3[arg0] = arg8;
                        } else if (arg6) {
                            arg3[arg0] = arg2;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg1 == 3) {
                for (int var56 = arg4 - 1; var56 >= 0; var56--) {
                    for (int var57 = arg5 - 1; var57 >= 0; var57--) {
                        if (var57 <= var56 << 1) {
                            arg3[arg0] = arg8;
                        } else if (arg6) {
                            arg3[arg0] = arg2;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            }
        } else if (arg7 != 5) {
            if (arg7 == 6) {
                if (arg1 == 0) {
                    for (int var42 = 0; var42 < arg4; var42++) {
                        for (int var43 = 0; var43 < arg5; var43++) {
                            if (arg5 / 2 >= var43) {
                                arg3[arg0] = arg8;
                            } else if (arg6) {
                                arg3[arg0] = arg2;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
                if (arg1 == 1) {
                    for (int var20 = 0; var20 < arg4; var20++) {
                        for (int var21 = 0; var21 < arg5; var21++) {
                            if (var20 <= arg4 / 2) {
                                arg3[arg0] = arg8;
                            } else if (arg6) {
                                arg3[arg0] = arg2;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
                if (arg1 == 2) {
                    for (int var22 = 0; var22 < arg4; var22++) {
                        for (int var23 = 0; var23 < arg5; var23++) {
                            if (var23 >= arg5 / 2) {
                                arg3[arg0] = arg8;
                            } else if (arg6) {
                                arg3[arg0] = arg2;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
                if (arg1 == 3) {
                    for (int var24 = 0; var24 < arg4; var24++) {
                        for (int var25 = 0; var25 < arg5; var25++) {
                            if (var24 >= arg4 / 2) {
                                arg3[arg0] = arg8;
                            } else if (arg6) {
                                arg3[arg0] = arg2;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
            }
            if (arg7 == 7) {
                if (arg1 == 0) {
                    for (int var26 = 0; var26 < arg4; var26++) {
                        for (int var27 = 0; var27 < arg5; var27++) {
                            if (var27 <= var26 - arg4 / 2) {
                                arg3[arg0] = arg8;
                            } else if (arg6) {
                                arg3[arg0] = arg2;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
                if (arg1 == 1) {
                    for (int var40 = arg4 - 1; var40 >= 0; var40--) {
                        for (int var41 = 0; var41 < arg5; var41++) {
                            if (var40 - arg4 / 2 >= var41) {
                                arg3[arg0] = arg8;
                            } else if (arg6) {
                                arg3[arg0] = arg2;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
                if (arg1 == 2) {
                    for (int var28 = arg4 - 1; var28 >= 0; var28--) {
                        for (int var29 = arg5 - 1; var29 >= 0; var29--) {
                            if (var28 - arg4 / 2 >= var29) {
                                arg3[arg0] = arg8;
                            } else if (arg6) {
                                arg3[arg0] = arg2;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
                if (arg1 == 3) {
                    for (int var38 = 0; var38 < arg4; var38++) {
                        for (int var39 = arg5 - 1; var39 >= 0; var39--) {
                            if (var38 - arg4 / 2 >= var39) {
                                arg3[arg0] = arg8;
                            } else if (arg6) {
                                arg3[arg0] = arg2;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
            }
            if (arg7 == 8) {
                if (arg1 == 0) {
                    for (int var30 = 0; var30 < arg4; var30++) {
                        for (int var31 = 0; var31 < arg5; var31++) {
                            if (var31 >= var30 - arg4 / 2) {
                                arg3[arg0] = arg8;
                            } else if (arg6) {
                                arg3[arg0] = arg2;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
                if (arg1 == 1) {
                    for (int var36 = arg4 - 1; var36 >= 0; var36--) {
                        for (int var37 = 0; var37 < arg5; var37++) {
                            if (var37 >= var36 - arg4 / 2) {
                                arg3[arg0] = arg8;
                            } else if (arg6) {
                                arg3[arg0] = arg2;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
                if (arg1 == 2) {
                    for (int var32 = arg4 - 1; var32 >= 0; var32--) {
                        for (int var33 = arg5 - 1; var33 >= 0; var33--) {
                            if (var32 - arg4 / 2 <= var33) {
                                arg3[arg0] = arg8;
                            } else if (arg6) {
                                arg3[arg0] = arg2;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
                if (arg1 == 3) {
                    for (int var34 = 0; var34 < arg4; var34++) {
                        for (int var35 = arg5 - 1; var35 >= 0; var35--) {
                            if (var34 - arg4 / 2 <= var35) {
                                arg3[arg0] = arg8;
                            } else if (arg6) {
                                arg3[arg0] = arg2;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
            }
        } else if (arg1 == 0) {
            for (int var44 = arg4 - 1; var44 >= 0; var44--) {
                for (int var45 = arg5 - 1; var45 >= 0; var45--) {
                    if (var45 >= var44 >> 1) {
                        arg3[arg0] = arg8;
                    } else if (arg6) {
                        arg3[arg0] = arg2;
                    }
                    arg0++;
                }
                arg0 += var11;
            }
        } else if (arg1 == 1) {
            for (int var46 = arg4 - 1; var46 >= 0; var46--) {
                for (int var47 = 0; var47 < arg5; var47++) {
                    if (var46 << 1 >= var47) {
                        arg3[arg0] = arg8;
                    } else if (arg6) {
                        arg3[arg0] = arg2;
                    }
                    arg0++;
                }
                arg0 += var11;
            }
        } else if (arg1 == 2) {
            for (int var50 = 0; var50 < arg4; var50++) {
                for (int var51 = 0; var51 < arg5; var51++) {
                    if (var51 >= var50 >> 1) {
                        arg3[arg0] = arg8;
                    } else if (arg6) {
                        arg3[arg0] = arg2;
                    }
                    arg0++;
                }
                arg0 += var11;
            }
        } else if (arg1 == 3) {
            for (int var48 = 0; var48 < arg4; var48++) {
                for (int var49 = arg5 - 1; var49 >= 0; var49--) {
                    if (var49 <= var48 << 1) {
                        arg3[arg0] = arg8;
                    } else if (arg6) {
                        arg3[arg0] = arg2;
                    }
                    arg0++;
                }
                arg0 += var11;
            }
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(I[B)V", line = 1689)
    private final void method94(int arg0, byte[] arg1) {
        int var3 = 0;
        if (arg0 < 18) {
            this.method99(28, null);
        }
        while (true) {
            while (arg1.length > var3) {
                int var4 = (arg1[var3++] & 0xFF) * 64 - class33.field412;
                int var5 = (arg1[var3++] & 0xFF) * 64 - class24.field229;
                if (var4 > 0 && var5 > 0 && var4 + 64 < class10.field97 && class29.field362 > var5 + 64) {
                    class28.field354 = var4 >> 6;
                    class29.field363 = class29.field362 - var5 - 1 >> 6;
                    for (int var6 = 0; var6 < 64; var6++) {
                        for (int var7 = -64; var7 < 0; var7++) {
                            int var8 = arg1[var3++] & 0xFF;
                            if (var8 != 0) {
                                byte var9 = arg1[var3++];
                                class37.method214(var4 + var6, 3, -151005338, var9, class29.field362 - var5 - var7 - 64 - 1);
                                if (class24.field236[class29.field363][class28.field354] == null) {
                                    class24.field236[class29.field363][class28.field354] = new class32();
                                    class24.field236[class29.field363][class28.field354].field395 = new byte[4096];
                                }
                                class24.field236[class29.field363][class28.field354].field395[(-(var7 + 1) << 6) + var6] = (byte) var8;
                            }
                        }
                    }
                    if (class24.field236[class29.field363][class28.field354] != null) {
                        class24.field236[class29.field363][class28.field354].method193(true);
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

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "([[B[BB)V", line = 1778)
    private final void method95(byte[][] arg0, byte[] arg1, byte arg2) {
        int var4 = 0;
        while (true) {
            while (arg1.length > var4) {
                int var5 = (arg1[var4++] & 0xFF) * 64 - class33.field412;
                int var6 = (arg1[var4++] & 0xFF) * 64 - class24.field229;
                if (var5 > 0 && var6 > 0 && var5 + 64 < class10.field97 && var6 + 64 < class29.field362) {
                    for (int var7 = 0; var7 < 64; var7++) {
                        int var8 = class29.field362 - var6 - 1;
                        byte[] var9 = arg0[var5 + var7];
                        for (int var10 = -64; var10 < 0; var10++) {
                            var9[var8--] = arg1[var4++];
                        }
                    }
                } else {
                    var4 += 4096;
                }
            }
            if (arg2 != 117) {
                this.field162 = null;
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(ILt;)V", line = 1827)
    public final void method96(int arg0, class37 arg1) {
        class19 var3 = new class19(arg1.method19(false, class1.field12, class32.field399));
        int var4 = var3.method119((byte) 120);
        int var5 = var3.method119((byte) 114);
        int var6 = var3.method119((byte) 118);
        int var7 = var3.method119((byte) 109);
        int var8 = var3.method119((byte) 111);
        int var9 = var3.method119((byte) 123);
        var3.method108(true);
        class29.field362 = (var7 + 1 - var5) * 64;
        class10.field97 = (var6 - var4) * 64 + 64;
        class24.field229 = var5 * 64;
        class33.field412 = arg0 * var4;
        class7.field63 = class29.field362 + class24.field229 - var9 * 64;
        class11.field100 = var8 * 64 - class33.field412;
        this.method88(class10.field97, (byte) -94, class29.field362);
        class19 var10 = new class19(arg1.method19(false, class1.field12, class38.field487));
        int var11 = var10.method119((byte) 124);
        class19.field189 = new int[var11 + 1];
        for (int var12 = 0; var12 < var11; var12++) {
            class19.field189[var12 + 1] = var10.method117(false);
        }
        int var13 = var10.method119((byte) 115);
        class28.field349 = new int[var13 + 1];
        for (int var14 = 0; var14 < var13; var14++) {
            class28.field349[var14 + 1] = var10.method117(false);
        }
        byte[] var15 = arg1.method19(false, class1.field12, class8.field76);
        byte[][] var16 = new byte[class10.field97][class29.field362];
        this.method95(var16, var15, (byte) 117);
        byte[] var17 = arg1.method19(false, class1.field12, class4.field47);
        this.method94(arg0 ^ 0x33, var17);
        byte[] var18 = arg1.method19(false, class1.field12, class17.field172);
        this.method99(arg0 + 1047818, var18);
        byte[] var19 = arg1.method19(false, class1.field12, class8.field74);
        class17.field169 = 0;
        this.method90(var19, 0);
        this.method87(21905, var16);
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(IIIBIIIIIII)V", line = 1907)
    public final void method97(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (this.field153 == 0) {
            int var12 = arg4 - arg2;
            int var13 = (arg10 - arg9 << 16) / var12;
            int var14 = arg5 - arg6;
            int var15 = (arg8 - arg1 << 16) / var14;
            for (int var16 = 0; var16 < var14; var16++) {
                int var17 = var15 * var16 >> 16;
                int var18 = (var16 + 1) * var15 >> 16;
                int var19 = var18 - var17;
                if (var19 > 0) {
                    class31.method190(arg6 + var16, -36, arg2);
                    for (int var20 = 0; var20 < var12; var20++) {
                        int var21 = var13 * var20 >> 16;
                        int var22 = (var20 + 1) * var13 >> 16;
                        int var23 = var22 - var21;
                        if (var23 > 0) {
                            int var24 = class37.method218(arg3 ^ 0x20) & 0xFF;
                            if (var24 != 0) {
                                this.field160[this.field153] = var24 - 1;
                                this.field157[this.field153] = var19 / 2 + var17;
                                this.field154[this.field153] = var21 + var23 / 2;
                                this.field153++;
                            }
                        }
                        class26.method150(true);
                    }
                }
            }
        }
        for (int var25 = 0; var25 < this.field153; var25++) {
            if (class32.field402[this.field160[var25]] != null) {
                class32.field402[this.field160[var25]].method206(this.field157[var25] - 7, this.field154[var25] + -7);
            }
        }
        if (arg3 != 94) {
            field159 = null;
        }
        if (arg0 > 0) {
            for (int var26 = 0; var26 < this.field153; var26++) {
                if (this.field160[var26] == arg7) {
                    class32.field402[this.field160[var26]].method206(this.field157[var26] - 7, this.field154[var26] - 7);
                    if (arg0 % 10 < 5) {
                        class40.method258(this.field157[var26], this.field154[var26], 15, 16776960, 128);
                        class40.method258(this.field157[var26], this.field154[var26], 7, 16777215, 256);
                    }
                }
            }
        }
        this.field153 = 0;
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(B)V", line = 2016)
    public static void method98(byte arg0) {
        field158 = null;
        field161 = null;
        if (arg0 > -84) {
            return;
        }
        field156 = null;
        field159 = null;
        field148 = null;
        field149 = null;
        field152 = null;
    }

    @OriginalMember(owner = "mapview!ha", name = "b", descriptor = "(I[B)V", line = 2054)
    private final void method99(int arg0, byte[] arg1) {
        if (arg0 != 1047882) {
            field149 = null;
        }
        int var3 = 0;
        while (true) {
            while (arg1.length > var3) {
                int var4 = (arg1[var3++] & 0xFF) * 64 - class33.field412;
                int var5 = (arg1[var3++] & 0xFF) * 64 - class24.field229;
                if (var4 > 0 && var5 > 0 && var4 + 64 < class10.field97 && var5 + 64 < class29.field362) {
                    class28.field354 = var4 >> 6;
                    class29.field363 = class29.field362 - var5 - 1 >> 6;
                    for (int var6 = 0; var6 < 64; var6++) {
                        for (int var7 = -64; var7 < 0; var7++) {
                            int var8 = arg1[var3++] & 0xFF;
                            if (var8 != 0) {
                                byte var9 = arg1[var3++];
                                class37.method214(var4 + var6, 4, arg0 ^ 0xF6F02A2C, var9, class29.field362 - var5 - var7 - 1 - 64);
                                if (class10.field95[class29.field363][class28.field354] == null) {
                                    class10.field95[class29.field363][class28.field354] = new class32();
                                    class10.field95[class29.field363][class28.field354].field395 = new byte[4096];
                                }
                                class10.field95[class29.field363][class28.field354].field395[(-(var7 + 1) << 6) + var6] = (byte) var8;
                            }
                        }
                    }
                    if (class10.field95[class29.field363][class28.field354] != null) {
                        class10.field95[class29.field363][class28.field354].method193(true);
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

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(IIIIIIIBI)V", line = 2151)
    public final void method100(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        int var10 = arg5 - arg0;
        int var11 = arg1 - arg4;
        this.field153 = 0;
        int var12 = (arg6 - arg8 << 16) / var11;
        if (arg7 != -112) {
            field152 = null;
        }
        int var13 = (arg2 - arg3 << 16) / var10;
        for (int var14 = 0; var14 < var11; var14++) {
            int var15 = (var14 + 1) * var12 >> 16;
            int var16 = var12 * var14 >> 16;
            int var17 = var15 - var16;
            if (var17 > 0) {
                class31.method190(var14 + arg4, -43, arg0);
                for (int var18 = 0; var18 < var10; var18++) {
                    int var19 = var13 * var18 >> 16;
                    int var20 = (var18 + 1) * var13 >> 16;
                    int var21 = var20 - var19;
                    if (var21 > 0) {
                        int var22 = class34.method202(1920) & 0xFF;
                        if (var22 != 0) {
                            int var23;
                            if (var17 == 1) {
                                var23 = var16;
                            } else {
                                var23 = var15 - 1;
                            }
                            int var24;
                            if (var21 == 1) {
                                var24 = var19;
                            } else {
                                var24 = var20 - 1;
                            }
                            int var25 = 13421772;
                            if (var22 >= 5 && var22 <= 8 || var22 >= 13 && var22 <= 16 || var22 >= 21 && var22 <= 24 || var22 == 27 || var22 == 28) {
                                var25 = 13369344;
                                var22 -= 4;
                            }
                            if (var22 == 1) {
                                class40.method257(var16, var19, var21, var25);
                            } else if (var22 == 2) {
                                class40.method262(var16, var19, var17, var25);
                            } else if (var22 == 3) {
                                class40.method257(var23, var19, var21, var25);
                            } else if (var22 == 4) {
                                class40.method262(var16, var24, var17, var25);
                            } else if (var22 == 9) {
                                class40.method257(var16, var19, var21, 16777215);
                                class40.method262(var16, var19, var17, var25);
                            } else if (var22 == 10) {
                                class40.method257(var23, var19, var21, 16777215);
                                class40.method262(var16, var19, var17, var25);
                            } else if (var22 == 11) {
                                class40.method257(var23, var19, var21, 16777215);
                                class40.method262(var16, var24, var17, var25);
                            } else if (var22 == 12) {
                                class40.method257(var16, var19, var21, 16777215);
                                class40.method262(var16, var24, var17, var25);
                            } else if (var22 == 17) {
                                class40.method262(var16, var19, 1, var25);
                            } else if (var22 == 18) {
                                class40.method262(var23, var19, 1, var25);
                            } else if (var22 == 19) {
                                class40.method262(var23, var24, 1, var25);
                            } else if (var22 == 20) {
                                class40.method262(var16, var24, 1, var25);
                            } else if (var22 == 25) {
                                for (int var27 = 0; var27 < var21; var27++) {
                                    class40.method262(var16 + var27, -var27 + var24, 1, var25);
                                }
                            } else if (var22 == 26) {
                                for (int var26 = 0; var26 < var21; var26++) {
                                    class40.method262(var16 + var26, var19 + var26, 1, var25);
                                }
                            }
                        }
                        int var28 = class37.method218(127) & 0xFF;
                        if (var28 != 0) {
                            this.field160[this.field153] = var28 - 1;
                            this.field157[this.field153] = var16 + var17 / 2;
                            this.field154[this.field153] = var21 / 2 + var19;
                            this.field153++;
                        }
                    }
                    class26.method150(true);
                }
            }
        }
    }
}
