import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!w")
public class class41 {

    @OriginalMember(owner = "mapview!w", name = "b", descriptor = "[I")
    public int[] field534 = new int[1500];

    @OriginalMember(owner = "mapview!w", name = "e", descriptor = "[I")
    public int[] field537 = new int[1500];

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "[I")
    private int[] field533 = new int[1500];

    @OriginalMember(owner = "mapview!w", name = "h", descriptor = "I")
    private int field540 = 0;

    @OriginalMember(owner = "mapview!w", name = "j", descriptor = "[I")
    private int[] field542 = new int[1500];

    @OriginalMember(owner = "mapview!w", name = "l", descriptor = "[I")
    public int[] field544 = new int[1500];

    @OriginalMember(owner = "mapview!w", name = "m", descriptor = "[I")
    private int[] field545 = new int[1500];

    @OriginalMember(owner = "mapview!w", name = "c", descriptor = "Lf;")
    public static class10 field535 = class23.method139("Jewellery", (byte) -109);

    @OriginalMember(owner = "mapview!w", name = "i", descriptor = "Lf;")
    public static class10 field541 = class23.method139("Anvil", (byte) -109);

    @OriginalMember(owner = "mapview!w", name = "k", descriptor = "Lf;")
    public static class10 field543 = class23.method139("null", (byte) -102);

    @OriginalMember(owner = "mapview!w", name = "f", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "mapview!w", name = "d", descriptor = "[I")
    public static int[] field536;

    @OriginalMember(owner = "mapview!w", name = "g", descriptor = "[I")
    public static int[] field539;

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "([BI)V", line = 5)
    private final void method254(byte[] arg0, int arg1) {
        if (arg1 != 784942032) {
            this.field545 = null;
        }
        int var3 = 0;
        while (true) {
            while (var3 < arg0.length) {
                int var4 = (arg0[var3++] & 0xFF) * 64 - class37.field512;
                int var5 = (arg0[var3++] & 0xFF) * 64 - class23.field249;
                if (var4 > 0 && var5 > 0 && class18.field161 > var4 + 64 && var5 + 64 < class11.field124) {
                    for (int var6 = 0; var6 < 64; var6++) {
                        int var7 = class11.field124 - var5 - 1;
                        for (int var8 = -64; var8 < 0; var8++) {
                            while (true) {
                                int var9 = arg0[var3++] & 0xFF;
                                if (var9 == 0) {
                                    break;
                                }
                                if (var9 < 29) {
                                    class4.method16(0, (byte) var9, true, class11.field124 - var8 - var5 - 1 - 64, var4 + var6);
                                } else if (var9 < 160) {
                                    class4.method16(1, (byte) (var9 - 28), true, class11.field124 - var8 - var5 - 1 - 64, var4 + var6);
                                } else {
                                    class4.method16(2, (byte) (var9 - 159), true, class11.field124 - var8 - var5 - 64 - 1, var4 + var6);
                                    if (class28.field397 >= 1500) {
                                        break;
                                    }
                                    this.field544[class28.field397] = var4 + var6;
                                    this.field534[class28.field397] = var7;
                                    this.field537[class28.field397] = var9 - 160;
                                    class28.field397++;
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

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(IDIIIIIIII)V", line = 109)
    public final void method255(int arg0, double arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var12 = arg8 - arg0;
        int var13 = (arg9 - arg6 << 16) / var12;
        int var14 = arg7 - arg3;
        int var15 = -18 % ((arg2 - 42) / 36);
        int var16 = (arg5 - arg4 << 16) / var14;
        if (arg8 - arg0 > arg9 - arg6) {
            return;
        }
        this.field540 = 0;
        for (int var17 = 0; var17 < var12; var17++) {
            int var18 = var13 * var17 >> 16;
            int var19 = (var17 + 1) * var13 >> 16;
            int var20 = var19 - var18;
            if (var20 > 0) {
                class6.method36(arg3, 63, arg0 + var17);
                for (int var21 = 0; var21 < var14; var21++) {
                    int var22 = (var21 + 1) * var16 >> 16;
                    int var23 = var16 * var21 >> 16;
                    int var24 = var22 - var23;
                    if (var24 > 0) {
                        int var25 = class20.method130(-1) & 0xFF;
                        if (var25 != 0) {
                            if (var25 == 47 || var25 == 53) {
                                class30.field410[var25 - 1].method172(var18, var23, var20 * 2 + 1, var24 * 2 - -1);
                                if (!(arg1 < 4.0D) && arg1 > 4.2D && !(arg1 > 6.2D)) {
                                }
                            } else {
                                class30.field410[var25 - 1].method172(var18 - var20 / 2, var23 - var24 / 2, var20 * 2, var24 * 2);
                            }
                        }
                    }
                    class38.method244(466);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(Lc;IBI)[Lu;", line = 233)
    public static final class39[] method256(class5 arg0, int arg1, byte arg2, int arg3) {
        if (class37.method240(arg1, arg3, -119, arg0)) {
            return arg2 <= 2 ? (class39[]) null : class2.method4(255);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(IIIIIIIIIII)V", line = 274)
    public final void method257(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (this.field540 == 0) {
            int var12 = arg5 - arg0;
            int var13 = arg2 - arg1;
            int var14 = (arg6 - arg7 << 16) / var12;
            int var15 = (arg8 - arg9 << 16) / var13;
            for (int var16 = 0; var16 < var12; var16++) {
                int var17 = var14 * var16 >> 16;
                int var18 = (var16 + 1) * var14 >> 16;
                int var19 = var18 - var17;
                if (var19 > 0) {
                    class6.method36(arg1, 63, arg0 + var16);
                    for (int var20 = 0; var20 < var13; var20++) {
                        int var21 = var15 * var20 >> 16;
                        int var22 = (var20 + 1) * var15 >> 16;
                        int var23 = var22 - var21;
                        if (var23 > 0) {
                            int var24 = class15.method108(110) & 0xFF;
                            if (var24 != 0) {
                                this.field533[this.field540] = var24 - 1;
                                this.field542[this.field540] = var19 / 2 + var17;
                                this.field545[this.field540] = var21 + var23 / 2;
                                this.field540++;
                            }
                        }
                        class38.method244(466);
                    }
                }
            }
        }
        int var25 = 34 / ((44 - arg3) / 53);
        for (int var26 = 0; var26 < this.field540; var26++) {
            if (class25.field268[this.field533[var26]] != null) {
                class25.field268[this.field533[var26]].method252(this.field542[var26] - 7, this.field545[var26] + -7);
            }
        }
        if (arg4 > 0) {
            for (int var27 = 0; var27 < this.field540; var27++) {
                if (this.field533[var27] == arg10) {
                    class25.field268[this.field533[var27]].method252(this.field542[var27] - 7, this.field545[var27] + -7);
                    if (arg4 % 10 < 5) {
                        class13.method93(this.field542[var27], this.field545[var27], 15, 16776960, 128);
                        class13.method93(this.field542[var27], this.field545[var27], 7, 16777215, 256);
                    }
                }
            }
        }
        this.field540 = 0;
    }

    @OriginalMember(owner = "mapview!w", name = "b", descriptor = "([BI)V", line = 384)
    private final void method258(byte[] arg0, int arg1) {
        if (arg1 != -232391600) {
            this.method258(null, 34);
        }
        int var3 = 0;
        while (true) {
            while (arg0.length > var3) {
                int var4 = (arg0[var3++] & 0xFF) * 64 - class37.field512;
                int var5 = (arg0[var3++] & 0xFF) * 64 - class23.field249;
                if (var4 > 0 && var5 > 0 && var4 + 64 < class18.field161 && var5 + 64 < class11.field124) {
                    class25.field276 = class11.field124 - var5 - 1 >> 6;
                    class1.field8 = var4 >> 6;
                    for (int var6 = 0; var6 < 64; var6++) {
                        for (int var7 = -64; var7 < 0; var7++) {
                            int var8 = arg0[var3++] & 0xFF;
                            if (var8 != 0) {
                                byte var9 = arg0[var3++];
                                class4.method16(3, var9, true, class11.field124 - var7 - var5 - 1 - 64, var4 + var6);
                                if (class23.field248[class25.field276][class1.field8] == null) {
                                    class23.field248[class25.field276][class1.field8] = new class24();
                                    class23.field248[class25.field276][class1.field8].field261 = new byte[4096];
                                }
                                class23.field248[class25.field276][class1.field8].field261[(-(var7 + 1) << 6) + var6] = (byte) var8;
                            }
                        }
                    }
                    if (class23.field248[class25.field276][class1.field8] != null) {
                        class23.field248[class25.field276][class1.field8].method143(6310);
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

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "([B[[BB)V", line = 474)
    private final void method259(byte[] arg0, byte[][] arg1, byte arg2) {
        if (arg2 > -88) {
            this.method262(false, -104, null, 40, -61, (byte) 91, -112, 96, 105, -57);
        }
        int var4 = 0;
        while (true) {
            while (var4 < arg0.length) {
                int var5 = (arg0[var4++] & 0xFF) * 64 - class37.field512;
                int var6 = (arg0[var4++] & 0xFF) * 64 - class23.field249;
                if (var5 > 0 && var6 > 0 && var5 + 64 < class18.field161 && class11.field124 > var6 + 64) {
                    for (int var7 = 0; var7 < 64; var7++) {
                        byte[] var8 = arg1[var5 + var7];
                        int var9 = class11.field124 - var6 - 1;
                        for (int var10 = -64; var10 < 0; var10++) {
                            var8[var9--] = arg0[var4++];
                        }
                    }
                } else {
                    var4 += 4096;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(IBIIIIIII)V", line = 529)
    public final void method260(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = arg7 - arg6;
        int var11 = arg5 - arg4;
        int var12 = (arg3 - arg8 << 16) / var10;
        int var13 = (arg0 - arg2 << 16) / var11;
        int var14 = -77 / ((-arg1 - 10) / 35);
        for (int var15 = 0; var15 < var10; var15++) {
            int var16 = var12 * var15 >> 16;
            int var17 = (var15 + 1) * var12 >> 16;
            int var18 = var17 - var16;
            if (var18 > 0) {
                int var19 = arg8 + var17;
                int var20 = arg8 + var16;
                class6.method36(arg4, 63, arg6 + var15);
                for (int var21 = 0; var21 < var11; var21++) {
                    int var22 = var13 * var21 >> 16;
                    int var23 = (var21 + 1) * var13 >> 16;
                    int var24 = var23 - var22;
                    if (var24 > 0) {
                        int var25 = arg2 + var22;
                        int var26 = arg2 + var23;
                        int var27 = class25.method145(43);
                        int var28 = class4.method20(0);
                        if (var27 == 0 && var28 == 0) {
                            class13.method96(var20, var25, var19 - var20, -var25 + var26, class10.method76(-123));
                        } else {
                            byte var29 = class27.method176(false);
                            int var30 = var29 & 0xFC;
                            if (var30 == 0 || var18 <= 1 || var24 <= 1) {
                                class13.method96(var20, var25, var18, var24, var27);
                            } else {
                                this.method262(true, class13.field131 * var25 + var20, class13.field126, var27, class10.method76(-123), (byte) -102, var24, var30 >> 2, var29 & 0x3, var18);
                            }
                            if (var28 > 0) {
                                byte var31 = class18.method114(96);
                                int var32 = var31 & 0xFC;
                                if (var32 == 0 || var18 <= 1 || var24 <= 1) {
                                    class13.method96(var20, var25, var18, var24, var28);
                                }
                                this.method262(var27 == 0, class13.field131 * var25 + var20, class13.field126, var28, class10.method76(-123), (byte) -105, var24, var32 >> 2, var31 & 0x3, var18);
                            }
                        }
                    }
                    class38.method244(466);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(DDDI)I", line = 622)
    private final int method261(double arg0, double arg1, double arg2, int arg3) {
        double var8 = arg2;
        double var10 = arg2;
        double var12 = arg2;
        if (arg1 != 0.0D) {
            double var14;
            if (arg2 < 0.5D) {
                var14 = (arg1 + 1.0D) * arg2;
            } else {
                var14 = arg1 + arg2 - arg1 * arg2;
            }
            double var16 = arg0 + 0.3333333333333333D;
            if (var16 > 1.0D) {
                var16--;
            }
            double var18 = arg2 * 2.0D - var14;
            if (var16 * 6.0D < 1.0D) {
                var10 = (var14 - var18) * 6.0D * var16 + var18;
            } else if (var16 * 2.0D < 1.0D) {
                var10 = var14;
            } else if (var16 * 3.0D < 2.0D) {
                var10 = (0.6666666666666666D - var16) * (-var18 + var14) * 6.0D + var18;
            } else {
                var10 = var18;
            }
            double var22 = arg0 - 0.3333333333333333D;
            if (var22 < 0.0D) {
                var22++;
            }
            if (var22 * 6.0D < 1.0D) {
                var12 = (var14 - var18) * 6.0D * var22 + var18;
            } else if (var22 * 2.0D < 1.0D) {
                var12 = var14;
            } else if (var22 * 3.0D < 2.0D) {
                var12 = (var14 - var18) * (-var22 + 0.6666666666666666D) * 6.0D + var18;
            } else {
                var12 = var18;
            }
            if (arg0 * 6.0D < 1.0D) {
                var8 = (var14 - var18) * 6.0D * arg0 + var18;
            } else if (arg0 * 2.0D < 1.0D) {
                var8 = var14;
            } else if (arg0 * 3.0D < 2.0D) {
                var8 = (var14 - var18) * (0.6666666666666666D - arg0) * 6.0D + var18;
            } else {
                var8 = var18;
            }
        }
        int var24 = (int) (var10 * 256.0D);
        int var25 = (int) (var8 * 256.0D);
        if (arg3 == 15977) {
            int var26 = (int) (var12 * 256.0D);
            return (var25 << 8) + (var24 << 16) + var26;
        } else {
            return 56;
        }
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(ZI[IIIBIIII)V", line = 711)
    private final void method262(boolean arg0, int arg1, int[] arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg7 == 9) {
            arg8 = arg8 + 1 & 0x3;
            arg7 = 1;
        }
        if (arg7 == 10) {
            arg8 = arg8 + 3 & 0x3;
            arg7 = 1;
        }
        if (arg5 > -58) {
            field536 = null;
        }
        int var11 = class13.field131 - arg9;
        if (arg7 == 11) {
            arg8 = arg8 + 3 & 0x3;
            arg7 = 8;
        }
        if (arg7 == 1) {
            if (arg8 == 0) {
                for (int var12 = 0; var12 < arg6; var12++) {
                    for (int var13 = 0; var13 < arg9; var13++) {
                        if (var13 <= var12) {
                            arg2[arg1] = arg3;
                        } else if (arg0) {
                            arg2[arg1] = arg4;
                        }
                        arg1++;
                    }
                    arg1 += var11;
                }
            } else if (arg8 == 1) {
                for (int var18 = arg6 - 1; var18 >= 0; var18--) {
                    for (int var19 = 0; var19 < arg9; var19++) {
                        if (var19 <= var18) {
                            arg2[arg1] = arg3;
                        } else if (arg0) {
                            arg2[arg1] = arg4;
                        }
                        arg1++;
                    }
                    arg1 += var11;
                }
            } else if (arg8 == 2) {
                for (int var14 = 0; var14 < arg6; var14++) {
                    for (int var15 = 0; var15 < arg9; var15++) {
                        if (var14 <= var15) {
                            arg2[arg1] = arg3;
                        } else if (arg0) {
                            arg2[arg1] = arg4;
                        }
                        arg1++;
                    }
                    arg1 += var11;
                }
            } else if (arg8 == 3) {
                for (int var16 = arg6 - 1; var16 >= 0; var16--) {
                    for (int var17 = 0; var17 < arg9; var17++) {
                        if (var17 >= var16) {
                            arg2[arg1] = arg3;
                        } else if (arg0) {
                            arg2[arg1] = arg4;
                        }
                        arg1++;
                    }
                    arg1 += var11;
                }
            }
        } else if (arg7 == 2) {
            if (arg8 == 0) {
                for (int var68 = arg6 - 1; var68 >= 0; var68--) {
                    for (int var69 = 0; var69 < arg9; var69++) {
                        if (var69 <= var68 >> 1) {
                            arg2[arg1] = arg3;
                        } else if (arg0) {
                            arg2[arg1] = arg4;
                        }
                        arg1++;
                    }
                    arg1 += var11;
                }
            } else if (arg8 == 1) {
                for (int var74 = 0; var74 < arg6; var74++) {
                    for (int var75 = 0; var75 < arg9; var75++) {
                        if (var75 >= var74 << 1) {
                            arg2[arg1] = arg3;
                        } else if (arg0) {
                            arg2[arg1] = arg4;
                        }
                        arg1++;
                    }
                    arg1 += var11;
                }
            } else if (arg8 == 2) {
                for (int var72 = 0; var72 < arg6; var72++) {
                    for (int var73 = arg9 - 1; var73 >= 0; var73--) {
                        if (var72 >> 1 >= var73) {
                            arg2[arg1] = arg3;
                        } else if (arg0) {
                            arg2[arg1] = arg4;
                        }
                        arg1++;
                    }
                    arg1 += var11;
                }
            } else if (arg8 == 3) {
                for (int var70 = arg6 - 1; var70 >= 0; var70--) {
                    for (int var71 = arg9 - 1; var71 >= 0; var71--) {
                        if (var71 >= var70 << 1) {
                            arg2[arg1] = arg3;
                        } else if (arg0) {
                            arg2[arg1] = arg4;
                        }
                        arg1++;
                    }
                    arg1 += var11;
                }
            }
        } else if (arg7 == 3) {
            if (arg8 == 0) {
                for (int var66 = arg6 - 1; var66 >= 0; var66--) {
                    for (int var67 = arg9 - 1; var67 >= 0; var67--) {
                        if (var67 <= var66 >> 1) {
                            arg2[arg1] = arg3;
                        } else if (arg0) {
                            arg2[arg1] = arg4;
                        }
                        arg1++;
                    }
                    arg1 += var11;
                }
            } else if (arg8 == 1) {
                for (int var60 = arg6 - 1; var60 >= 0; var60--) {
                    for (int var61 = 0; var61 < arg9; var61++) {
                        if (var61 >= var60 << 1) {
                            arg2[arg1] = arg3;
                        } else if (arg0) {
                            arg2[arg1] = arg4;
                        }
                        arg1++;
                    }
                    arg1 += var11;
                }
            } else if (arg8 == 2) {
                for (int var62 = 0; var62 < arg6; var62++) {
                    for (int var63 = 0; var63 < arg9; var63++) {
                        if (var62 >> 1 >= var63) {
                            arg2[arg1] = arg3;
                        } else if (arg0) {
                            arg2[arg1] = arg4;
                        }
                        arg1++;
                    }
                    arg1 += var11;
                }
            } else if (arg8 == 3) {
                for (int var64 = 0; var64 < arg6; var64++) {
                    for (int var65 = arg9 - 1; var65 >= 0; var65--) {
                        if (var64 << 1 <= var65) {
                            arg2[arg1] = arg3;
                        } else if (arg0) {
                            arg2[arg1] = arg4;
                        }
                        arg1++;
                    }
                    arg1 += var11;
                }
            }
        } else if (arg7 == 4) {
            if (arg8 == 0) {
                for (int var26 = arg6 - 1; var26 >= 0; var26--) {
                    for (int var27 = 0; var27 < arg9; var27++) {
                        if (var27 >= var26 >> 1) {
                            arg2[arg1] = arg3;
                        } else if (arg0) {
                            arg2[arg1] = arg4;
                        }
                        arg1++;
                    }
                    arg1 += var11;
                }
            } else if (arg8 == 1) {
                for (int var20 = 0; var20 < arg6; var20++) {
                    for (int var21 = 0; var21 < arg9; var21++) {
                        if (var20 << 1 >= var21) {
                            arg2[arg1] = arg3;
                        } else if (arg0) {
                            arg2[arg1] = arg4;
                        }
                        arg1++;
                    }
                    arg1 += var11;
                }
            } else if (arg8 == 2) {
                for (int var22 = 0; var22 < arg6; var22++) {
                    for (int var23 = arg9 - 1; var23 >= 0; var23--) {
                        if (var23 >= var22 >> 1) {
                            arg2[arg1] = arg3;
                        } else if (arg0) {
                            arg2[arg1] = arg4;
                        }
                        arg1++;
                    }
                    arg1 += var11;
                }
            } else if (arg8 == 3) {
                for (int var24 = arg6 - 1; var24 >= 0; var24--) {
                    for (int var25 = arg9 - 1; var25 >= 0; var25--) {
                        if (var24 << 1 >= var25) {
                            arg2[arg1] = arg3;
                        } else if (arg0) {
                            arg2[arg1] = arg4;
                        }
                        arg1++;
                    }
                    arg1 += var11;
                }
            }
        } else if (arg7 != 5) {
            if (arg7 == 6) {
                if (arg8 == 0) {
                    for (int var50 = 0; var50 < arg6; var50++) {
                        for (int var51 = 0; var51 < arg9; var51++) {
                            if (var51 <= arg9 / 2) {
                                arg2[arg1] = arg3;
                            } else if (arg0) {
                                arg2[arg1] = arg4;
                            }
                            arg1++;
                        }
                        arg1 += var11;
                    }
                    return;
                }
                if (arg8 == 1) {
                    for (int var48 = 0; var48 < arg6; var48++) {
                        for (int var49 = 0; var49 < arg9; var49++) {
                            if (arg6 / 2 >= var48) {
                                arg2[arg1] = arg3;
                            } else if (arg0) {
                                arg2[arg1] = arg4;
                            }
                            arg1++;
                        }
                        arg1 += var11;
                    }
                    return;
                }
                if (arg8 == 2) {
                    for (int var28 = 0; var28 < arg6; var28++) {
                        for (int var29 = 0; var29 < arg9; var29++) {
                            if (var29 >= arg9 / 2) {
                                arg2[arg1] = arg3;
                            } else if (arg0) {
                                arg2[arg1] = arg4;
                            }
                            arg1++;
                        }
                        arg1 += var11;
                    }
                    return;
                }
                if (arg8 == 3) {
                    for (int var30 = 0; var30 < arg6; var30++) {
                        for (int var31 = 0; var31 < arg9; var31++) {
                            if (arg6 / 2 <= var30) {
                                arg2[arg1] = arg3;
                            } else if (arg0) {
                                arg2[arg1] = arg4;
                            }
                            arg1++;
                        }
                        arg1 += var11;
                    }
                    return;
                }
            }
            if (arg7 == 7) {
                if (arg8 == 0) {
                    for (int var38 = 0; var38 < arg6; var38++) {
                        for (int var39 = 0; var39 < arg9; var39++) {
                            if (var38 - arg6 / 2 >= var39) {
                                arg2[arg1] = arg3;
                            } else if (arg0) {
                                arg2[arg1] = arg4;
                            }
                            arg1++;
                        }
                        arg1 += var11;
                    }
                    return;
                }
                if (arg8 == 1) {
                    for (int var36 = arg6 - 1; var36 >= 0; var36--) {
                        for (int var37 = 0; var37 < arg9; var37++) {
                            if (var36 - arg6 / 2 >= var37) {
                                arg2[arg1] = arg3;
                            } else if (arg0) {
                                arg2[arg1] = arg4;
                            }
                            arg1++;
                        }
                        arg1 += var11;
                    }
                    return;
                }
                if (arg8 == 2) {
                    for (int var34 = arg6 - 1; var34 >= 0; var34--) {
                        for (int var35 = arg9 - 1; var35 >= 0; var35--) {
                            if (var34 - arg6 / 2 >= var35) {
                                arg2[arg1] = arg3;
                            } else if (arg0) {
                                arg2[arg1] = arg4;
                            }
                            arg1++;
                        }
                        arg1 += var11;
                    }
                    return;
                }
                if (arg8 == 3) {
                    for (int var32 = 0; var32 < arg6; var32++) {
                        for (int var33 = arg9 - 1; var33 >= 0; var33--) {
                            if (var33 <= var32 - arg6 / 2) {
                                arg2[arg1] = arg3;
                            } else if (arg0) {
                                arg2[arg1] = arg4;
                            }
                            arg1++;
                        }
                        arg1 += var11;
                    }
                    return;
                }
            }
            if (arg7 == 8) {
                if (arg8 == 0) {
                    for (int var40 = 0; var40 < arg6; var40++) {
                        for (int var41 = 0; var41 < arg9; var41++) {
                            if (var41 >= var40 - arg6 / 2) {
                                arg2[arg1] = arg3;
                            } else if (arg0) {
                                arg2[arg1] = arg4;
                            }
                            arg1++;
                        }
                        arg1 += var11;
                    }
                    return;
                }
                if (arg8 == 1) {
                    for (int var46 = arg6 - 1; var46 >= 0; var46--) {
                        for (int var47 = 0; var47 < arg9; var47++) {
                            if (var47 >= var46 - arg6 / 2) {
                                arg2[arg1] = arg3;
                            } else if (arg0) {
                                arg2[arg1] = arg4;
                            }
                            arg1++;
                        }
                        arg1 += var11;
                    }
                    return;
                }
                if (arg8 == 2) {
                    for (int var44 = arg6 - 1; var44 >= 0; var44--) {
                        for (int var45 = arg9 - 1; var45 >= 0; var45--) {
                            if (var45 >= var44 - arg6 / 2) {
                                arg2[arg1] = arg3;
                            } else if (arg0) {
                                arg2[arg1] = arg4;
                            }
                            arg1++;
                        }
                        arg1 += var11;
                    }
                    return;
                }
                if (arg8 == 3) {
                    for (int var42 = 0; var42 < arg6; var42++) {
                        for (int var43 = arg9 - 1; var43 >= 0; var43--) {
                            if (var43 >= var42 - arg6 / 2) {
                                arg2[arg1] = arg3;
                            } else if (arg0) {
                                arg2[arg1] = arg4;
                            }
                            arg1++;
                        }
                        arg1 += var11;
                    }
                    return;
                }
            }
        } else if (arg8 == 0) {
            for (int var58 = arg6 - 1; var58 >= 0; var58--) {
                for (int var59 = arg9 - 1; var59 >= 0; var59--) {
                    if (var59 >= var58 >> 1) {
                        arg2[arg1] = arg3;
                    } else if (arg0) {
                        arg2[arg1] = arg4;
                    }
                    arg1++;
                }
                arg1 += var11;
            }
        } else if (arg8 == 1) {
            for (int var56 = arg6 - 1; var56 >= 0; var56--) {
                for (int var57 = 0; var57 < arg9; var57++) {
                    if (var57 <= var56 << 1) {
                        arg2[arg1] = arg3;
                    } else if (arg0) {
                        arg2[arg1] = arg4;
                    }
                    arg1++;
                }
                arg1 += var11;
            }
        } else if (arg8 == 2) {
            for (int var52 = 0; var52 < arg6; var52++) {
                for (int var53 = 0; var53 < arg9; var53++) {
                    if (var52 >> 1 <= var53) {
                        arg2[arg1] = arg3;
                    } else if (arg0) {
                        arg2[arg1] = arg4;
                    }
                    arg1++;
                }
                arg1 += var11;
            }
        } else if (arg8 == 3) {
            for (int var54 = 0; var54 < arg6; var54++) {
                for (int var55 = arg9 - 1; var55 >= 0; var55--) {
                    if (var54 << 1 >= var55) {
                        arg2[arg1] = arg3;
                    } else if (arg0) {
                        arg2[arg1] = arg4;
                    }
                    arg1++;
                }
                arg1 += var11;
            }
        }
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(I[[B)V", line = 1840)
    private final void method263(int arg0, byte[][] arg1) {
        int var3 = class18.field161;
        int var4 = class11.field124;
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = 0;
        }
        if (arg0 <= 0) {
            this.field545 = null;
        }
        for (int var7 = 5; var7 < var3 - 5; var7++) {
            byte[] var8 = arg1[var7 + 5];
            byte[] var9 = arg1[var7 - 5];
            for (int var10 = 0; var10 < var4; var10++) {
                int var11 = class30.field413[var9[var10] & 0xFF];
                int var12 = class30.field413[var8[var10] & 0xFF];
                if (var12 <= 0 && class33.method219(var10, var7 + 5, 121) > 0) {
                    var12 = 64;
                }
                if (var11 <= 0 && class33.method219(var10, var7 - 5, -30) > 0) {
                    var11 = 64;
                }
                var5[var10] += var12 - var11;
            }
            if (var7 > 10 && var7 < var3 - 10) {
                int var13 = 0;
                int var14 = 0;
                int var15 = 0;
                for (int var16 = 5; var16 < var4 - 5; var16++) {
                    int var17 = var5[var16 - 5];
                    int var18 = var5[var16 + 5];
                    var14 += (var18 >> 20) - (var17 >> 20);
                    var15 += (var18 & 0x3FF) - (var17 & 0x3FF);
                    var13 += (var18 >> 10 & 0x3FF) - ((var17 & 0xFFFF9) >> 10);
                    if (var15 > 0) {
                        int var19 = var7 >> 6;
                        int var20 = var16 >> 6;
                        if (class7.field69[var20][var19] == null) {
                            class7.field69[var20][var19] = new int[4096];
                        }
                        if ((arg1[var7][var16] & 0xFF) <= 0) {
                            class7.field69[var20][var19][class2.method5(var7, 63) + class2.method5(4032, var16 << 6)] = 0;
                        } else {
                            class7.field69[var20][var19][(class2.method5(63, var16) << 6) + class2.method5(63, var7)] = this.method261((double) var14 / 8533.0D, (double) var13 / 8533.0D, (double) var15 / 8533.0D, 15977);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(III)V", line = 1940)
    private final void method264(int arg0, int arg1, int arg2) {
        int var4 = arg2 >> 6;
        int var5 = arg1 >> 6;
        class7.field69 = new int[var5][var4][];
        class38.field527[3] = new byte[var5][var4][];
        class38.field527[2] = new byte[var5][var4][];
        class38.field527[0] = new byte[var5][var4][];
        class38.field527[1] = new byte[var5][var4][];
        class38.field527[4] = new byte[var5][var4][];
        if (arg0 < 75) {
            field536 = null;
        }
        class33.field477 = new class24[var5][var4];
        class23.field248 = new class24[var5][var4];
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(I)V", line = 1959)
    public static void method265(int arg0) {
        field541 = null;
        field535 = null;
        field536 = null;
        field543 = null;
        if (arg0 != -1) {
            method256(null, -41, (byte) 51, -32);
        }
        field539 = null;
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(I[Lf;)Lf;", line = 1979)
    public static final class10 method266(int arg0, class10[] arg1) {
        if (arg0 >= -115) {
            field543 = null;
        }
        if (arg1.length < 2) {
            throw new IllegalArgumentException();
        }
        return class33.method216(86, 0, arg1, arg1.length);
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(ILa;)V", line = 2004)
    public final void method267(int arg0, class1 arg1) {
        class28 var3 = new class28(arg1.method33(arg0 - 120, class6.field54, class15.field137));
        int var4 = var3.method184(-2);
        int var5 = var3.method184(-2);
        int var6 = var3.method184(arg0 ^ 0x1);
        int var7 = var3.method184(-2);
        int var8 = var3.method184(-2);
        int var9 = var3.method184(-2);
        var3.method183((byte) -29);
        class11.field124 = (var7 + 1 - var5) * 64;
        class23.field249 = var5 * 64;
        class18.field161 = (var6 - var4) * 64 + 64;
        class38.field525 = class23.field249 + class11.field124 - var9 * 64;
        class37.field512 = var4 * 64;
        class10.field100 = var8 * 64 - class37.field512;
        this.method264(arg0 ^ 0xFFFFFF95, class11.field124, class18.field161);
        class28 var10 = new class28(arg1.method33(arg0 ^ 0x51, mapview.field317, class15.field137));
        int var11 = var10.method184(-2);
        class30.field413 = new int[var11 + 1];
        for (int var12 = 0; var12 < var11; var12++) {
            class30.field413[var12 + 1] = var10.method181(-9110);
        }
        int var13 = var10.method184(-2);
        field536 = new int[var13 + 1];
        for (int var14 = 0; var14 < var13; var14++) {
            field536[var14 + 1] = var10.method181(-9110);
        }
        if (arg0 != -1) {
            this.method262(true, 41, null, -1, -99, (byte) -11, 21, 61, 4, -108);
        }
        byte[] var15 = arg1.method33(-90, class6.field57, class15.field137);
        byte[][] var16 = new byte[class18.field161][class11.field124];
        this.method259(var15, var16, (byte) -96);
        byte[] var17 = arg1.method33(-72, class8.field75, class15.field137);
        this.method258(var17, arg0 - 232391599);
        byte[] var18 = arg1.method33(-20, class7.field71, class15.field137);
        this.method269(var18, (byte) 127);
        byte[] var19 = arg1.method33(-16, class23.field254, class15.field137);
        class28.field397 = 0;
        this.method254(var19, 784942032);
        this.method263(120, var16);
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(IIIIIIIII)V", line = 2080)
    public final void method268(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = arg0 - arg8;
        int var11 = 6 / ((arg2 - 78) / 34);
        int var12 = arg6 - arg4;
        this.field540 = 0;
        int var13 = (arg1 - arg5 << 16) / var12;
        int var14 = (arg3 - arg7 << 16) / var10;
        for (int var15 = 0; var15 < var10; var15++) {
            int var16 = var14 * var15 >> 16;
            int var17 = (var15 + 1) * var14 >> 16;
            int var18 = var17 - var16;
            if (var18 > 0) {
                class6.method36(arg4, 63, var15 + arg8);
                for (int var19 = 0; var19 < var12; var19++) {
                    int var20 = var13 * var19 >> 16;
                    int var21 = (var19 + 1) * var13 >> 16;
                    int var22 = var21 - var20;
                    if (var22 > 0) {
                        int var23 = class6.method38(95) & 0xFF;
                        if (var23 != 0) {
                            int var24;
                            if (var18 == 1) {
                                var24 = var16;
                            } else {
                                var24 = var17 - 1;
                            }
                            int var25;
                            if (var22 == 1) {
                                var25 = var20;
                            } else {
                                var25 = var21 - 1;
                            }
                            int var26 = 13421772;
                            if (var23 >= 5 && var23 <= 8 || var23 >= 13 && var23 <= 16 || var23 >= 21 && var23 <= 24 || var23 == 27 || var23 == 28) {
                                var23 -= 4;
                                var26 = 13369344;
                            }
                            if (var23 == 1) {
                                class13.method94(var16, var20, var22, var26);
                            } else if (var23 == 2) {
                                class13.method97(var16, var20, var18, var26);
                            } else if (var23 == 3) {
                                class13.method94(var24, var20, var22, var26);
                            } else if (var23 == 4) {
                                class13.method97(var16, var25, var18, var26);
                            } else if (var23 == 9) {
                                class13.method94(var16, var20, var22, 16777215);
                                class13.method97(var16, var20, var18, var26);
                            } else if (var23 == 10) {
                                class13.method94(var24, var20, var22, 16777215);
                                class13.method97(var16, var20, var18, var26);
                            } else if (var23 == 11) {
                                class13.method94(var24, var20, var22, 16777215);
                                class13.method97(var16, var25, var18, var26);
                            } else if (var23 == 12) {
                                class13.method94(var16, var20, var22, 16777215);
                                class13.method97(var16, var25, var18, var26);
                            } else if (var23 == 17) {
                                class13.method97(var16, var20, 1, var26);
                            } else if (var23 == 18) {
                                class13.method97(var24, var20, 1, var26);
                            } else if (var23 == 19) {
                                class13.method97(var24, var25, 1, var26);
                            } else if (var23 == 20) {
                                class13.method97(var16, var25, 1, var26);
                            } else if (var23 == 25) {
                                for (int var27 = 0; var27 < var22; var27++) {
                                    class13.method97(var16 + var27, -var27 + var25, 1, var26);
                                }
                            } else if (var23 == 26) {
                                for (int var28 = 0; var28 < var22; var28++) {
                                    class13.method97(var16 + var28, var20 - -var28, 1, var26);
                                }
                            }
                        }
                        int var29 = class15.method108(121) & 0xFF;
                        if (var29 != 0) {
                            this.field533[this.field540] = var29 - 1;
                            this.field542[this.field540] = var16 + var18 / 2;
                            this.field545[this.field540] = var22 / 2 + var20;
                            this.field540++;
                        }
                    }
                    class38.method244(466);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "([BB)V", line = 2266)
    private final void method269(byte[] arg0, byte arg1) {
        if (arg1 <= 124) {
            field541 = null;
        }
        int var3 = 0;
        while (true) {
            while (arg0.length > var3) {
                int var4 = (arg0[var3++] & 0xFF) * 64 - class37.field512;
                int var5 = (arg0[var3++] & 0xFF) * 64 - class23.field249;
                if (var4 > 0 && var5 > 0 && class18.field161 > var4 + 64 && var5 + 64 < class11.field124) {
                    class1.field8 = var4 >> 6;
                    class25.field276 = class11.field124 - var5 - 1 >> 6;
                    for (int var6 = 0; var6 < 64; var6++) {
                        for (int var7 = -64; var7 < 0; var7++) {
                            int var8 = arg0[var3++] & 0xFF;
                            if (var8 != 0) {
                                byte var9 = arg0[var3++];
                                class4.method16(4, var9, true, class11.field124 - var7 - var5 - 1 - 64, var4 - -var6);
                                if (class33.field477[class25.field276][class1.field8] == null) {
                                    class33.field477[class25.field276][class1.field8] = new class24();
                                    class33.field477[class25.field276][class1.field8].field261 = new byte[4096];
                                }
                                class33.field477[class25.field276][class1.field8].field261[(-(var7 + 1) << 6) + var6] = (byte) var8;
                            }
                        }
                    }
                    if (class33.field477[class25.field276][class1.field8] != null) {
                        class33.field477[class25.field276][class1.field8].method143(6310);
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
}
