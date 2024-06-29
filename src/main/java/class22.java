import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!l")
public class class22 {

    @OriginalMember(owner = "mapview!l", name = "e", descriptor = "[I")
    private int[] field234 = new int[1500];

    @OriginalMember(owner = "mapview!l", name = "j", descriptor = "[I")
    private int[] field239 = new int[1500];

    @OriginalMember(owner = "mapview!l", name = "l", descriptor = "[I")
    private int[] field241 = new int[1500];

    @OriginalMember(owner = "mapview!l", name = "c", descriptor = "[I")
    public int[] field232 = new int[1500];

    @OriginalMember(owner = "mapview!l", name = "h", descriptor = "I")
    private int field237 = 0;

    @OriginalMember(owner = "mapview!l", name = "g", descriptor = "[I")
    public int[] field236 = new int[1500];

    @OriginalMember(owner = "mapview!l", name = "p", descriptor = "[I")
    public int[] field245 = new int[1500];

    @OriginalMember(owner = "mapview!l", name = "b", descriptor = "I")
    public static volatile int field231 = -1;

    @OriginalMember(owner = "mapview!l", name = "k", descriptor = "Lr;")
    public static class33 field240 = class29.method192("Axe Shop", (byte) 126);

    @OriginalMember(owner = "mapview!l", name = "n", descriptor = "Lr;")
    public static class33 field243 = class29.method192("75(U", (byte) 126);

    @OriginalMember(owner = "mapview!l", name = "o", descriptor = "Lr;")
    public static class33 field244 = class29.method192("Water Source", (byte) 126);

    @OriginalMember(owner = "mapview!l", name = "i", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "mapview!l", name = "m", descriptor = "Lea;")
    public static class10 field242;

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "[I")
    public static int[] field230;

    @OriginalMember(owner = "mapview!l", name = "f", descriptor = "[[Ls;")
    public static class35[][] field235;

    @OriginalMember(owner = "mapview!l", name = "d", descriptor = "[[[I")
    public static int[][][] field233;

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(I)Ld;", line = 5)
    public static final class7 method139(int arg0) {
        class7 var1 = new class7(class36.field494, class21.field219, field230, class11.field146, class32.field448);
        if (arg0 < 86) {
            field240 = null;
        }
        class2.method14((byte) -102);
        return var1;
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "([BI)V", line = 21)
    private final void method140(byte[] arg0, int arg1) {
        if (arg1 != 14499) {
            this.field234 = null;
        }
        int var3 = 0;
        while (true) {
            while (arg0.length > var3) {
                int var4 = (arg0[var3++] & 0xFF) * 64 - class14.field176;
                int var5 = (arg0[var3++] & 0xFF) * 64 - class21.field228;
                if (var4 > 0 && var5 > 0 && var4 + 64 < class21.field229 && class14.field175 > var5 + 64) {
                    class21.field216 = class14.field175 - var5 - 1 >> 6;
                    class32.field454 = var4 >> 6;
                    for (int var6 = 0; var6 < 64; var6++) {
                        for (int var7 = -64; var7 < 0; var7++) {
                            int var8 = arg0[var3++] & 0xFF;
                            if (var8 != 0) {
                                byte var9 = arg0[var3++];
                                class30.method197(class14.field175 - var5 - var7 - 64 - 1, 4, (byte) -127, var4 + var6, var9);
                                if (field235[class21.field216][class32.field454] == null) {
                                    field235[class21.field216][class32.field454] = new class35();
                                    field235[class21.field216][class32.field454].field481 = new byte[4096];
                                }
                                field235[class21.field216][class32.field454].field481[(-(var7 + 1) << 6) + var6] = (byte) var8;
                            }
                        }
                    }
                    if (field235[class21.field216][class32.field454] != null) {
                        field235[class21.field216][class32.field454].method238((byte) 108);
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

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(B)[Lh;", line = 106)
    public static final class15[] method141(byte arg0) {
        if (arg0 != -92) {
            return (class15[]) null;
        }
        class15[] var1 = new class15[class35.field477];
        for (int var2 = 0; var2 < class35.field477; var2++) {
            class15 var3 = var1[var2] = new class15();
            var3.field181 = class13.field165;
            var3.field184 = field238;
            var3.field179 = class25.field272[var2];
            var3.field182 = class36.field494[var2];
            var3.field177 = class21.field219[var2];
            var3.field183 = field230[var2];
            var3.field178 = class11.field146;
            var3.field180 = class32.field448[var2];
        }
        class2.method14((byte) -23);
        return var1;
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(DDZD)I", line = 139)
    private final int method142(double arg0, double arg1, boolean arg2, double arg3) {
        double var8 = arg0;
        if (!arg2) {
            this.method145(98, -39, true, 113, true, -12, 53, null, -81, -77);
        }
        double var10 = arg0;
        double var12 = arg0;
        if (arg1 != 0.0D) {
            double var14;
            if (arg0 < 0.5D) {
                var14 = (arg1 + 1.0D) * arg0;
            } else {
                var14 = arg0 + arg1 - arg0 * arg1;
            }
            double var16 = arg0 * 2.0D - var14;
            double var18 = arg3 + 0.3333333333333333D;
            double var20 = arg3 - 0.3333333333333333D;
            if (var18 > 1.0D) {
                var18--;
            }
            if (var18 * 6.0D < 1.0D) {
                var8 = (var14 - var16) * 6.0D * var18 + var16;
            } else if (var18 * 2.0D < 1.0D) {
                var8 = var14;
            } else if (var18 * 3.0D < 2.0D) {
                var8 = (0.6666666666666666D - var18) * (-var16 + var14) * 6.0D + var16;
            } else {
                var8 = var16;
            }
            if (var20 < 0.0D) {
                var20++;
            }
            if (var20 * 6.0D < 1.0D) {
                var12 = (var14 - var16) * 6.0D * var20 + var16;
            } else if (var20 * 2.0D < 1.0D) {
                var12 = var14;
            } else if (var20 * 3.0D < 2.0D) {
                var12 = (var14 - var16) * (0.6666666666666666D - var20) * 6.0D + var16;
            } else {
                var12 = var16;
            }
            if (arg3 * 6.0D < 1.0D) {
                var10 = (var14 - var16) * 6.0D * arg3 + var16;
            } else if (arg3 * 2.0D < 1.0D) {
                var10 = var14;
            } else if (arg3 * 3.0D < 2.0D) {
                var10 = (0.6666666666666666D - arg3) * (-var16 + var14) * 6.0D + var16;
            } else {
                var10 = var16;
            }
        }
        int var24 = (int) (var8 * 256.0D);
        int var25 = (int) (var10 * 256.0D);
        int var26 = (int) (var12 * 256.0D);
        return (var24 << 16) + ((var25 << 8) + var26);
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(IIIIIIIIIII)V", line = 235)
    public final void method143(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (this.field237 == 0) {
            int var12 = arg0 - arg4;
            int var13 = arg5 - arg9;
            int var14 = (arg7 - arg10 << 16) / var12;
            int var15 = (arg3 - arg6 << 16) / var13;
            for (int var16 = 0; var16 < var12; var16++) {
                int var17 = var14 * var16 >> 16;
                int var18 = (var16 + 1) * var14 >> 16;
                int var19 = var18 - var17;
                if (var19 > 0) {
                    class12.method81(arg1 ^ 0xFF0000B9, var16 + arg4, arg9);
                    for (int var20 = 0; var20 < var13; var20++) {
                        int var21 = (var20 + 1) * var15 >> 16;
                        int var22 = var15 * var20 >> 16;
                        int var23 = var21 - var22;
                        if (var23 > 0) {
                            int var24 = class29.method193(102) & 0xFF;
                            if (var24 != 0) {
                                this.field241[this.field237] = var24 - 1;
                                this.field239[this.field237] = var17 + var19 / 2;
                                this.field234[this.field237] = var23 / 2 + var22;
                                this.field237++;
                            }
                        }
                        class31.method202(arg1 - 16794188);
                    }
                }
            }
        }
        int var25 = 0;
        if (arg1 != 16776960) {
            field235 = null;
        }
        while (var25 < this.field237) {
            if (class8.field110[this.field241[var25]] != null) {
                class8.field110[this.field241[var25]].method56(this.field239[var25] - 7, this.field234[var25] + -7);
            }
            var25++;
        }
        if (arg2 > 0) {
            for (int var26 = 0; var26 < this.field237; var26++) {
                if (this.field241[var26] == arg8) {
                    class8.field110[this.field241[var26]].method56(this.field239[var26] - 7, this.field234[var26] + -7);
                    if (arg2 % 10 < 5) {
                        class1.method6(this.field239[var26], this.field234[var26], 15, 16776960, 128);
                        class1.method6(this.field239[var26], this.field234[var26], 7, 16777215, 256);
                    }
                }
            }
        }
        this.field237 = 0;
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "([[BI)V", line = 348)
    private final void method144(byte[][] arg0, int arg1) {
        int var3 = class21.field229;
        if (arg1 != -5) {
            this.method144(null, 115);
        }
        int var4 = class14.field175;
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = 0;
        }
        for (int var7 = 5; var7 < var3 - 5; var7++) {
            byte[] var8 = arg0[var7 + 5];
            byte[] var9 = arg0[var7 - 5];
            for (int var10 = 0; var10 < var4; var10++) {
                int var11 = class12.field160[var8[var10] & 0xFF];
                int var12 = class12.field160[var9[var10] & 0xFF];
                if (var11 <= 0 && class12.method86(var10, (byte) 24, var7 + 5) > 0) {
                    var11 = 64;
                }
                if (var12 <= 0 && class12.method86(var10, (byte) 24, var7 - 5) > 0) {
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
                    var15 += (var18 >> 10 & 0x3FF) - ((var17 & 0xFFE1A) >> 10);
                    var14 += (var18 & 0x3FF) - (var17 & 0x3FF);
                    var13 += (var18 >> 20) - (var17 >> 20);
                    if (var14 > 0) {
                        int var19 = var7 >> 6;
                        int var20 = var16 >> 6;
                        if (field233[var20][var19] == null) {
                            field233[var20][var19] = new int[4096];
                        }
                        if ((arg0[var7][var16] & 0xFF) <= 0) {
                            field233[var20][var19][class30.method198(63, var7) + class30.method198(var16 << 6, 4032)] = 0;
                        } else {
                            field233[var20][var19][class30.method198(var16 << 6, 4032) + class30.method198(63, var7)] = this.method142((double) var14 / 8533.0D, (double) var15 / 8533.0D, true, (double) var13 / 8533.0D);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(IIZIZII[III)V", line = 451)
    private final void method145(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9) {
        int var11 = class1.field3 - arg1;
        if (arg8 == 9) {
            arg8 = 1;
            arg6 = arg6 + 1 & 0x3;
        }
        if (arg8 == 10) {
            arg6 = arg6 + 3 & 0x3;
            arg8 = 1;
        }
        if (arg8 == 11) {
            arg6 = arg6 + 3 & 0x3;
            arg8 = 8;
        }
        if (arg8 == 1) {
            if (arg6 == 0) {
                for (int var68 = 0; var68 < arg9; var68++) {
                    for (int var69 = 0; var69 < arg1; var69++) {
                        if (var69 <= var68) {
                            arg7[arg5] = arg3;
                        } else if (arg4) {
                            arg7[arg5] = arg0;
                        }
                        arg5++;
                    }
                    arg5 += var11;
                }
            } else if (arg6 == 1) {
                for (int var70 = arg9 - 1; var70 >= 0; var70--) {
                    for (int var71 = 0; var71 < arg1; var71++) {
                        if (var71 <= var70) {
                            arg7[arg5] = arg3;
                        } else if (arg4) {
                            arg7[arg5] = arg0;
                        }
                        arg5++;
                    }
                    arg5 += var11;
                }
            } else if (arg6 == 2) {
                for (int var72 = 0; var72 < arg9; var72++) {
                    for (int var73 = 0; var73 < arg1; var73++) {
                        if (var72 <= var73) {
                            arg7[arg5] = arg3;
                        } else if (arg4) {
                            arg7[arg5] = arg0;
                        }
                        arg5++;
                    }
                    arg5 += var11;
                }
            } else if (arg6 == 3) {
                for (int var74 = arg9 - 1; var74 >= 0; var74--) {
                    for (int var75 = 0; var75 < arg1; var75++) {
                        if (var75 >= var74) {
                            arg7[arg5] = arg3;
                        } else if (arg4) {
                            arg7[arg5] = arg0;
                        }
                        arg5++;
                    }
                    arg5 += var11;
                }
            }
        } else if (arg8 == 2) {
            if (arg6 == 0) {
                for (int var18 = arg9 - 1; var18 >= 0; var18--) {
                    for (int var19 = 0; var19 < arg1; var19++) {
                        if (var19 <= var18 >> 1) {
                            arg7[arg5] = arg3;
                        } else if (arg4) {
                            arg7[arg5] = arg0;
                        }
                        arg5++;
                    }
                    arg5 += var11;
                }
            } else if (arg6 == 1) {
                for (int var12 = 0; var12 < arg9; var12++) {
                    for (int var13 = 0; var13 < arg1; var13++) {
                        if (var12 << 1 <= var13) {
                            arg7[arg5] = arg3;
                        } else if (arg4) {
                            arg7[arg5] = arg0;
                        }
                        arg5++;
                    }
                    arg5 += var11;
                }
            } else if (arg6 == 2) {
                for (int var14 = 0; var14 < arg9; var14++) {
                    for (int var15 = arg1 - 1; var15 >= 0; var15--) {
                        if (var14 >> 1 >= var15) {
                            arg7[arg5] = arg3;
                        } else if (arg4) {
                            arg7[arg5] = arg0;
                        }
                        arg5++;
                    }
                    arg5 += var11;
                }
            } else if (arg6 == 3) {
                for (int var16 = arg9 - 1; var16 >= 0; var16--) {
                    for (int var17 = arg1 - 1; var17 >= 0; var17--) {
                        if (var16 << 1 <= var17) {
                            arg7[arg5] = arg3;
                        } else if (arg4) {
                            arg7[arg5] = arg0;
                        }
                        arg5++;
                    }
                    arg5 += var11;
                }
            }
        } else if (arg8 == 3) {
            if (arg6 == 0) {
                for (int var60 = arg9 - 1; var60 >= 0; var60--) {
                    for (int var61 = arg1 - 1; var61 >= 0; var61--) {
                        if (var60 >> 1 >= var61) {
                            arg7[arg5] = arg3;
                        } else if (arg4) {
                            arg7[arg5] = arg0;
                        }
                        arg5++;
                    }
                    arg5 += var11;
                }
            } else if (arg6 == 1) {
                for (int var62 = arg9 - 1; var62 >= 0; var62--) {
                    for (int var63 = 0; var63 < arg1; var63++) {
                        if (var62 << 1 <= var63) {
                            arg7[arg5] = arg3;
                        } else if (arg4) {
                            arg7[arg5] = arg0;
                        }
                        arg5++;
                    }
                    arg5 += var11;
                }
            } else if (arg6 == 2) {
                for (int var64 = 0; var64 < arg9; var64++) {
                    for (int var65 = 0; var65 < arg1; var65++) {
                        if (var64 >> 1 >= var65) {
                            arg7[arg5] = arg3;
                        } else if (arg4) {
                            arg7[arg5] = arg0;
                        }
                        arg5++;
                    }
                    arg5 += var11;
                }
            } else if (arg6 == 3) {
                for (int var66 = 0; var66 < arg9; var66++) {
                    for (int var67 = arg1 - 1; var67 >= 0; var67--) {
                        if (var66 << 1 <= var67) {
                            arg7[arg5] = arg3;
                        } else if (arg4) {
                            arg7[arg5] = arg0;
                        }
                        arg5++;
                    }
                    arg5 += var11;
                }
            }
        } else if (!arg2) {
            if (arg8 == 4) {
                if (arg6 == 0) {
                    for (int var26 = arg9 - 1; var26 >= 0; var26--) {
                        for (int var27 = 0; var27 < arg1; var27++) {
                            if (var27 >= var26 >> 1) {
                                arg7[arg5] = arg3;
                            } else if (arg4) {
                                arg7[arg5] = arg0;
                            }
                            arg5++;
                        }
                        arg5 += var11;
                    }
                } else if (arg6 == 1) {
                    for (int var20 = 0; var20 < arg9; var20++) {
                        for (int var21 = 0; var21 < arg1; var21++) {
                            if (var20 << 1 >= var21) {
                                arg7[arg5] = arg3;
                            } else if (arg4) {
                                arg7[arg5] = arg0;
                            }
                            arg5++;
                        }
                        arg5 += var11;
                    }
                } else if (arg6 == 2) {
                    for (int var22 = 0; var22 < arg9; var22++) {
                        for (int var23 = arg1 - 1; var23 >= 0; var23--) {
                            if (var23 >= var22 >> 1) {
                                arg7[arg5] = arg3;
                            } else if (arg4) {
                                arg7[arg5] = arg0;
                            }
                            arg5++;
                        }
                        arg5 += var11;
                    }
                } else if (arg6 == 3) {
                    for (int var24 = arg9 - 1; var24 >= 0; var24--) {
                        for (int var25 = arg1 - 1; var25 >= 0; var25--) {
                            if (var25 <= var24 << 1) {
                                arg7[arg5] = arg3;
                            } else if (arg4) {
                                arg7[arg5] = arg0;
                            }
                            arg5++;
                        }
                        arg5 += var11;
                    }
                }
            } else if (arg8 != 5) {
                if (arg8 == 6) {
                    if (arg6 == 0) {
                        for (int var36 = 0; var36 < arg9; var36++) {
                            for (int var37 = 0; var37 < arg1; var37++) {
                                if (arg1 / 2 >= var37) {
                                    arg7[arg5] = arg3;
                                } else if (arg4) {
                                    arg7[arg5] = arg0;
                                }
                                arg5++;
                            }
                            arg5 += var11;
                        }
                        return;
                    }
                    if (arg6 == 1) {
                        for (int var58 = 0; var58 < arg9; var58++) {
                            for (int var59 = 0; var59 < arg1; var59++) {
                                if (arg9 / 2 >= var58) {
                                    arg7[arg5] = arg3;
                                } else if (arg4) {
                                    arg7[arg5] = arg0;
                                }
                                arg5++;
                            }
                            arg5 += var11;
                        }
                        return;
                    }
                    if (arg6 == 2) {
                        for (int var56 = 0; var56 < arg9; var56++) {
                            for (int var57 = 0; var57 < arg1; var57++) {
                                if (arg1 / 2 <= var57) {
                                    arg7[arg5] = arg3;
                                } else if (arg4) {
                                    arg7[arg5] = arg0;
                                }
                                arg5++;
                            }
                            arg5 += var11;
                        }
                        return;
                    }
                    if (arg6 == 3) {
                        for (int var54 = 0; var54 < arg9; var54++) {
                            for (int var55 = 0; var55 < arg1; var55++) {
                                if (arg9 / 2 <= var54) {
                                    arg7[arg5] = arg3;
                                } else if (arg4) {
                                    arg7[arg5] = arg0;
                                }
                                arg5++;
                            }
                            arg5 += var11;
                        }
                        return;
                    }
                }
                if (arg8 == 7) {
                    if (arg6 == 0) {
                        for (int var52 = 0; var52 < arg9; var52++) {
                            for (int var53 = 0; var53 < arg1; var53++) {
                                if (var53 <= var52 - arg9 / 2) {
                                    arg7[arg5] = arg3;
                                } else if (arg4) {
                                    arg7[arg5] = arg0;
                                }
                                arg5++;
                            }
                            arg5 += var11;
                        }
                        return;
                    }
                    if (arg6 == 1) {
                        for (int var38 = arg9 - 1; var38 >= 0; var38--) {
                            for (int var39 = 0; var39 < arg1; var39++) {
                                if (var39 <= var38 - arg9 / 2) {
                                    arg7[arg5] = arg3;
                                } else if (arg4) {
                                    arg7[arg5] = arg0;
                                }
                                arg5++;
                            }
                            arg5 += var11;
                        }
                        return;
                    }
                    if (arg6 == 2) {
                        for (int var40 = arg9 - 1; var40 >= 0; var40--) {
                            for (int var41 = arg1 - 1; var41 >= 0; var41--) {
                                if (var41 <= var40 - arg9 / 2) {
                                    arg7[arg5] = arg3;
                                } else if (arg4) {
                                    arg7[arg5] = arg0;
                                }
                                arg5++;
                            }
                            arg5 += var11;
                        }
                        return;
                    }
                    if (arg6 == 3) {
                        for (int var42 = 0; var42 < arg9; var42++) {
                            for (int var43 = arg1 - 1; var43 >= 0; var43--) {
                                if (var42 - arg9 / 2 >= var43) {
                                    arg7[arg5] = arg3;
                                } else if (arg4) {
                                    arg7[arg5] = arg0;
                                }
                                arg5++;
                            }
                            arg5 += var11;
                        }
                        return;
                    }
                }
                if (arg8 == 8) {
                    if (arg6 == 0) {
                        for (int var50 = 0; var50 < arg9; var50++) {
                            for (int var51 = 0; var51 < arg1; var51++) {
                                if (var50 - arg9 / 2 <= var51) {
                                    arg7[arg5] = arg3;
                                } else if (arg4) {
                                    arg7[arg5] = arg0;
                                }
                                arg5++;
                            }
                            arg5 += var11;
                        }
                        return;
                    }
                    if (arg6 == 1) {
                        for (int var48 = arg9 - 1; var48 >= 0; var48--) {
                            for (int var49 = 0; var49 < arg1; var49++) {
                                if (var48 - arg9 / 2 <= var49) {
                                    arg7[arg5] = arg3;
                                } else if (arg4) {
                                    arg7[arg5] = arg0;
                                }
                                arg5++;
                            }
                            arg5 += var11;
                        }
                        return;
                    }
                    if (arg6 == 2) {
                        for (int var44 = arg9 - 1; var44 >= 0; var44--) {
                            for (int var45 = arg1 - 1; var45 >= 0; var45--) {
                                if (var45 >= var44 - arg9 / 2) {
                                    arg7[arg5] = arg3;
                                } else if (arg4) {
                                    arg7[arg5] = arg0;
                                }
                                arg5++;
                            }
                            arg5 += var11;
                        }
                        return;
                    }
                    if (arg6 == 3) {
                        for (int var46 = 0; var46 < arg9; var46++) {
                            for (int var47 = arg1 - 1; var47 >= 0; var47--) {
                                if (var46 - arg9 / 2 <= var47) {
                                    arg7[arg5] = arg3;
                                } else if (arg4) {
                                    arg7[arg5] = arg0;
                                }
                                arg5++;
                            }
                            arg5 += var11;
                        }
                        return;
                    }
                }
            } else if (arg6 == 0) {
                for (int var34 = arg9 - 1; var34 >= 0; var34--) {
                    for (int var35 = arg1 - 1; var35 >= 0; var35--) {
                        if (var35 >= var34 >> 1) {
                            arg7[arg5] = arg3;
                        } else if (arg4) {
                            arg7[arg5] = arg0;
                        }
                        arg5++;
                    }
                    arg5 += var11;
                }
            } else if (arg6 == 1) {
                for (int var32 = arg9 - 1; var32 >= 0; var32--) {
                    for (int var33 = 0; var33 < arg1; var33++) {
                        if (var33 <= var32 << 1) {
                            arg7[arg5] = arg3;
                        } else if (arg4) {
                            arg7[arg5] = arg0;
                        }
                        arg5++;
                    }
                    arg5 += var11;
                }
            } else if (arg6 == 2) {
                for (int var30 = 0; var30 < arg9; var30++) {
                    for (int var31 = 0; var31 < arg1; var31++) {
                        if (var31 >= var30 >> 1) {
                            arg7[arg5] = arg3;
                        } else if (arg4) {
                            arg7[arg5] = arg0;
                        }
                        arg5++;
                    }
                    arg5 += var11;
                }
            } else if (arg6 == 3) {
                for (int var28 = 0; var28 < arg9; var28++) {
                    for (int var29 = arg1 - 1; var29 >= 0; var29--) {
                        if (var28 << 1 >= var29) {
                            arg7[arg5] = arg3;
                        } else if (arg4) {
                            arg7[arg5] = arg0;
                        }
                        arg5++;
                    }
                    arg5 += var11;
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(BLda;)V", line = 1589)
    public final void method146(byte arg0, class8 arg1) {
        class20 var3 = new class20(arg1.method32(class4.field40, class21.field224, (byte) -116));
        int var4 = var3.method129(2);
        int var5 = var3.method129(2);
        int var6 = var3.method129(2);
        int var7 = var3.method129(2);
        int var8 = var3.method129(2);
        int var9 = var3.method129(2);
        var3.method126((byte) -121);
        class14.field175 = (var7 + 1 - var5) * 64;
        class14.field176 = var4 * 64;
        class21.field228 = var5 * 64;
        class21.field229 = (var6 - var4) * 64 + 64;
        class4.field36 = var8 * 64 - class14.field176;
        mapview.field361 = class21.field228 + class14.field175 - var9 * 64;
        this.method151((byte) -62, class21.field229, class14.field175);
        class20 var10 = new class20(arg1.method32(class21.field217, class21.field224, (byte) 80));
        int var11 = var10.method129(2);
        class12.field160 = new int[var11 + 1];
        for (int var12 = 0; var12 < var11; var12++) {
            class12.field160[var12 + 1] = var10.method128(3);
        }
        int var13 = var10.method129(2);
        class25.field273 = new int[var13 + 1];
        for (int var14 = 0; var14 < var13; var14++) {
            class25.field273[var14 + 1] = var10.method128(3);
        }
        byte[] var15 = arg1.method32(class5.field59, class21.field224, (byte) -57);
        byte[][] var16 = new byte[class21.field229][class14.field175];
        this.method154(-1, var16, var15);
        int var17 = 41 / ((42 - arg0) / 55);
        byte[] var18 = arg1.method32(class12.field159, class21.field224, (byte) 127);
        this.method147((byte) 121, var18);
        byte[] var19 = arg1.method32(class33.field473, class21.field224, (byte) -18);
        this.method140(var19, 14499);
        byte[] var20 = arg1.method32(class6.field76, class21.field224, (byte) 69);
        class6.field72 = 0;
        this.method150(var20, 780913808);
        this.method144(var16, -5);
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(B[B)V", line = 1660)
    private final void method147(byte arg0, byte[] arg1) {
        int var3 = 0;
        if (arg0 < 113) {
            return;
        }
        while (true) {
            while (var3 < arg1.length) {
                int var4 = (arg1[var3++] & 0xFF) * 64 - class14.field176;
                int var5 = (arg1[var3++] & 0xFF) * 64 - class21.field228;
                if (var4 > 0 && var5 > 0 && class21.field229 > var4 + 64 && class14.field175 > var5 + 64) {
                    class21.field216 = class14.field175 - var5 - 1 >> 6;
                    class32.field454 = var4 >> 6;
                    for (int var6 = 0; var6 < 64; var6++) {
                        for (int var7 = -64; var7 < 0; var7++) {
                            int var8 = arg1[var3++] & 0xFF;
                            if (var8 != 0) {
                                byte var9 = arg1[var3++];
                                class30.method197(class14.field175 - var5 - var7 - 64 - 1, 3, (byte) -122, var4 + var6, var9);
                                if (class24.field262[class21.field216][class32.field454] == null) {
                                    class24.field262[class21.field216][class32.field454] = new class35();
                                    class24.field262[class21.field216][class32.field454].field481 = new byte[4096];
                                }
                                class24.field262[class21.field216][class32.field454].field481[(-(var7 + 1) << 6) + var6] = (byte) var8;
                            }
                        }
                    }
                    if (class24.field262[class21.field216][class32.field454] != null) {
                        class24.field262[class21.field216][class32.field454].method238((byte) 108);
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

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(IIIIIIZII)V", line = 1739)
    public final void method148(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
        int var10 = arg4 - arg1;
        int var11 = arg5 - arg0;
        int var12 = (arg7 - arg2 << 16) / var10;
        int var13 = (arg8 - arg3 << 16) / var11;
        if (arg6) {
            this.method147((byte) -13, null);
        }
        for (int var14 = 0; var14 < var10; var14++) {
            int var15 = var12 * var14 >> 16;
            int var16 = (var14 + 1) * var12 >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                int var18 = arg2 + var16;
                int var19 = arg2 + var15;
                class12.method81(-82, arg1 + var14, arg0);
                for (int var20 = 0; var20 < var11; var20++) {
                    int var21 = (var20 + 1) * var13 >> 16;
                    int var22 = var13 * var20 >> 16;
                    int var23 = var21 - var22;
                    if (var23 > 0) {
                        int var24 = arg3 + var22;
                        int var25 = arg3 + var21;
                        int var26 = class37.method248(-16167);
                        int var27 = class5.method29(104);
                        if (var26 == 0 && var27 == 0) {
                            class1.method11(var19, var24, var18 - var19, -var24 + var25, class24.method159(0));
                        } else {
                            byte var28 = method152(4096);
                            int var29 = var28 & 0xFC;
                            if (var29 == 0 || var17 <= 1 || var23 <= 1) {
                                class1.method11(var19, var24, var17, var23, var26);
                            } else {
                                this.method145(class24.method159(0), var17, false, var26, true, class1.field3 * var24 + var19, var28 & 0x3, class1.field6, var29 >> 2, var23);
                            }
                            if (var27 > 0) {
                                byte var30 = class10.method67(94);
                                int var31 = var30 & 0xFC;
                                if (var31 == 0 || var17 <= 1 || var23 <= 1) {
                                    class1.method11(var19, var24, var17, var23, var27);
                                }
                                this.method145(class24.method159(0), var17, arg6, var27, var26 == 0, class1.field3 * var24 + var19, var30 & 0x3, class1.field6, var31 >> 2, var23);
                            }
                        }
                    }
                    class31.method202(-17228);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(ILjava/awt/Component;IB)Lp;", line = 1836)
    public static final class29 method149(int arg0, Component arg1, int arg2, byte arg3) {
        try {
            Class var4 = Class.forName("u");
            if (arg3 != -34) {
                method141((byte) 10);
            }
            class29 var5 = (class29) var4.getDeclaredConstructor().newInstance();
            var5.method72(255, arg1, arg0, arg2);
            return var5;
        } catch (Throwable var8) {
            class11 var7 = new class11();
            var7.method72(arg3 + 289, arg1, arg0, arg2);
            return var7;
        }
    }

    @OriginalMember(owner = "mapview!l", name = "b", descriptor = "([BI)V", line = 1861)
    private final void method150(byte[] arg0, int arg1) {
        if (arg1 != 780913808) {
            return;
        }
        int var3 = 0;
        while (true) {
            while (var3 < arg0.length) {
                int var4 = (arg0[var3++] & 0xFF) * 64 - class14.field176;
                int var5 = (arg0[var3++] & 0xFF) * 64 - class21.field228;
                if (var4 > 0 && var5 > 0 && class21.field229 > var4 + 64 && var5 + 64 < class14.field175) {
                    for (int var6 = 0; var6 < 64; var6++) {
                        int var7 = class14.field175 - var5 - 1;
                        for (int var8 = -64; var8 < 0; var8++) {
                            while (true) {
                                int var9 = arg0[var3++] & 0xFF;
                                if (var9 == 0) {
                                    break;
                                }
                                if (var9 < 29) {
                                    class30.method197(class14.field175 - var8 - var5 - 65, 0, (byte) -121, var4 + var6, (byte) var9);
                                } else if (var9 < 160) {
                                    class30.method197(class14.field175 - var8 - var5 - 1 - 64, 1, (byte) -125, var4 + var6, (byte) (var9 + -28));
                                } else {
                                    class30.method197(class14.field175 - var5 - var8 - 64 - 1, 2, (byte) -120, var4 + var6, (byte) (var9 + -159));
                                    if (class6.field72 >= 1500) {
                                        break;
                                    }
                                    this.field245[class6.field72] = var6 + var4;
                                    this.field232[class6.field72] = var7;
                                    this.field236[class6.field72] = var9 - 160;
                                    class6.field72++;
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

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(BII)V", line = 1969)
    private final void method151(byte arg0, int arg1, int arg2) {
        if (arg0 > -11) {
            field238 = 79;
        }
        int var4 = arg2 >> 6;
        int var5 = arg1 >> 6;
        field233 = new int[var4][var5][];
        class31.field441[2] = new byte[var4][var5][];
        class31.field441[1] = new byte[var4][var5][];
        class31.field441[4] = new byte[var4][var5][];
        class31.field441[0] = new byte[var4][var5][];
        field235 = new class35[var4][var5];
        class24.field262 = new class35[var4][var5];
        class31.field441[3] = new byte[var4][var5][];
    }

    @OriginalMember(owner = "mapview!l", name = "b", descriptor = "(I)B", line = 1988)
    private static final byte method152(int arg0) {
        if (arg0 == 4096) {
            return class29.field423 == null ? 0 : class29.field423[class26.field396];
        } else {
            return -82;
        }
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(IIIIIIIBI)V", line = 2002)
    public final void method153(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        this.field237 = 0;
        int var10 = arg5 - arg8;
        int var11 = 79 / ((-arg7 - 63) / 53);
        int var12 = (arg0 - arg2 << 16) / var10;
        int var13 = arg3 - arg4;
        int var14 = (arg6 - arg1 << 16) / var13;
        for (int var15 = 0; var15 < var10; var15++) {
            int var16 = var12 * var15 >> 16;
            int var17 = (var15 + 1) * var12 >> 16;
            int var18 = var17 - var16;
            if (var18 > 0) {
                class12.method81(-87, arg8 + var15, arg4);
                for (int var19 = 0; var19 < var13; var19++) {
                    int var20 = var14 * var19 >> 16;
                    int var21 = (var19 + 1) * var14 >> 16;
                    int var22 = var21 - var20;
                    if (var22 > 0) {
                        int var23 = class35.method237((byte) 10) & 0xFF;
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
                                class1.method7(var16, var20, var22, var26);
                            } else if (var23 == 2) {
                                class1.method4(var16, var20, var18, var26);
                            } else if (var23 == 3) {
                                class1.method7(var24, var20, var22, var26);
                            } else if (var23 == 4) {
                                class1.method4(var16, var25, var18, var26);
                            } else if (var23 == 9) {
                                class1.method7(var16, var20, var22, 16777215);
                                class1.method4(var16, var20, var18, var26);
                            } else if (var23 == 10) {
                                class1.method7(var24, var20, var22, 16777215);
                                class1.method4(var16, var20, var18, var26);
                            } else if (var23 == 11) {
                                class1.method7(var24, var20, var22, 16777215);
                                class1.method4(var16, var25, var18, var26);
                            } else if (var23 == 12) {
                                class1.method7(var16, var20, var22, 16777215);
                                class1.method4(var16, var25, var18, var26);
                            } else if (var23 == 17) {
                                class1.method4(var16, var20, 1, var26);
                            } else if (var23 == 18) {
                                class1.method4(var24, var20, 1, var26);
                            } else if (var23 == 19) {
                                class1.method4(var24, var25, 1, var26);
                            } else if (var23 == 20) {
                                class1.method4(var16, var25, 1, var26);
                            } else if (var23 == 25) {
                                for (int var28 = 0; var28 < var22; var28++) {
                                    class1.method4(var16 + var28, -var28 + var25, 1, var26);
                                }
                            } else if (var23 == 26) {
                                for (int var27 = 0; var27 < var22; var27++) {
                                    class1.method4(var16 + var27, var20 - -var27, 1, var26);
                                }
                            }
                        }
                        int var29 = class29.method193(117) & 0xFF;
                        if (var29 != 0) {
                            this.field241[this.field237] = var29 - 1;
                            this.field239[this.field237] = var18 / 2 + var16;
                            this.field234[this.field237] = var22 / 2 + var20;
                            this.field237++;
                        }
                    }
                    class31.method202(-17228);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(I[[B[B)V", line = 2187)
    private final void method154(int arg0, byte[][] arg1, byte[] arg2) {
        if (arg0 != -1) {
            this.field239 = null;
        }
        int var4 = 0;
        while (true) {
            while (var4 < arg2.length) {
                int var5 = (arg2[var4++] & 0xFF) * 64 - class14.field176;
                int var6 = (arg2[var4++] & 0xFF) * 64 - class21.field228;
                if (var5 > 0 && var6 > 0 && var5 + 64 < class21.field229 && class14.field175 > var6 + 64) {
                    for (int var7 = 0; var7 < 64; var7++) {
                        byte[] var8 = arg1[var7 + var5];
                        int var9 = class14.field175 - var6 - 1;
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

    @OriginalMember(owner = "mapview!l", name = "b", descriptor = "(B)V", line = 2252)
    public static void method155(byte arg0) {
        field233 = null;
        field242 = null;
        field244 = null;
        field243 = null;
        field230 = null;
        field235 = null;
        if (arg0 < 126) {
            method141((byte) 111);
        }
        field240 = null;
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(IIIIIZDIII)V", line = 2283)
    public final void method156(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, double arg6, int arg7, int arg8, int arg9) {
        int var12 = arg3 - arg9;
        int var13 = arg4 - arg7;
        int var14 = (arg8 - arg1 << 16) / var12;
        int var15 = (arg2 - arg0 << 16) / var13;
        if (arg8 - arg1 < arg3 - arg9) {
            return;
        }
        if (!arg5) {
            field244 = null;
        }
        this.field237 = 0;
        for (int var16 = 0; var16 < var12; var16++) {
            int var17 = var14 * var16 >> 16;
            int var18 = (var16 + 1) * var14 >> 16;
            int var19 = var18 - var17;
            if (var19 > 0) {
                class12.method81(-51, arg9 + var16, arg7);
                for (int var20 = 0; var20 < var13; var20++) {
                    int var21 = var15 * var20 >> 16;
                    int var22 = (var20 + 1) * var15 >> 16;
                    int var23 = var22 - var21;
                    if (var23 > 0) {
                        int var24 = class35.method241((byte) 17) & 0xFF;
                        if (var24 != 0) {
                            if (var24 == 47 || var24 == 53) {
                                if (!(arg6 < 4.0D) && arg6 > 4.2D && arg6 > 6.2D) {
                                }
                                class31.field445[var24 - 1].method101(var17, var21, var19 * 2 + 1, var23 * 2 + 1);
                            } else {
                                class31.field445[var24 - 1].method101(var17 - var19 / 2, -(var23 / 2) + var21, var19 * 2, var23 * 2);
                            }
                        }
                    }
                    class31.method202(-17228);
                }
            }
        }
    }
}
