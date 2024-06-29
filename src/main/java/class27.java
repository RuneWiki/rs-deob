import java.awt.event.KeyEvent;
import java.io.DataInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!na")
public class class27 {

    @OriginalMember(owner = "mapview!na", name = "d", descriptor = "I")
    private int field368 = 0;

    @OriginalMember(owner = "mapview!na", name = "c", descriptor = "[I")
    public int[] field367 = new int[1500];

    @OriginalMember(owner = "mapview!na", name = "g", descriptor = "[I")
    private int[] field371 = new int[1500];

    @OriginalMember(owner = "mapview!na", name = "j", descriptor = "[I")
    private int[] field374 = new int[1500];

    @OriginalMember(owner = "mapview!na", name = "b", descriptor = "[I")
    private int[] field366 = new int[1500];

    @OriginalMember(owner = "mapview!na", name = "h", descriptor = "[I")
    public int[] field372 = new int[1500];

    @OriginalMember(owner = "mapview!na", name = "m", descriptor = "[I")
    public int[] field377 = new int[1500];

    @OriginalMember(owner = "mapview!na", name = "f", descriptor = "Ld;")
    public static class7 field370 = class37.method242("Hunter Store", 1333943984);

    @OriginalMember(owner = "mapview!na", name = "i", descriptor = "Ld;")
    public static class7 field373 = class37.method242("Silver Shop", 1333943984);

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "I")
    public static int field365 = -1;

    @OriginalMember(owner = "mapview!na", name = "e", descriptor = "[J")
    public static long[] field369 = new long[32];

    @OriginalMember(owner = "mapview!na", name = "n", descriptor = "Ld;")
    public static class7 field378 = class37.method242("Cookery Shop", 1333943984);

    @OriginalMember(owner = "mapview!na", name = "k", descriptor = "J")
    public static long field375 = 0L;

    @OriginalMember(owner = "mapview!na", name = "l", descriptor = "I")
    public static int field376 = 0;

    @OriginalMember(owner = "mapview!na", name = "o", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "mapview!na", name = "p", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "mapview!na", name = "q", descriptor = "Ljava/io/DataInputStream;")
    public static DataInputStream field381;

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(IIDIIIIIII)V", line = 9)
    public final void method190(int arg0, int arg1, double arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var12 = arg3 - arg6;
        int var13 = (arg9 - arg0 << 16) / var12;
        int var14 = arg5 - arg8;
        int var15 = (arg1 - arg7 << 16) / var14;
        if (arg9 - arg0 < -arg6 + arg3) {
            return;
        }
        this.field368 = 0;
        for (int var16 = 0; var16 < var12; var16++) {
            int var17 = (var16 + 1) * var13 >> 16;
            int var18 = var13 * var16 >> 16;
            int var19 = var17 - var18;
            if (var19 > 0) {
                class15.method109(arg8, -1216657178, arg6 + var16);
                for (int var20 = 0; var20 < var14; var20++) {
                    int var21 = (var20 + 1) * var15 >> 16;
                    int var22 = var15 * var20 >> 16;
                    int var23 = var21 - var22;
                    if (var23 > 0) {
                        int var24 = class13.method100(-73) & 0xFF;
                        if (var24 != 0) {
                            if (var24 == 47 || var24 == 53) {
                                class32.field464[var24 - 1].method152(var18, var22, var19 * 2 + 1, var23 * 2 - -1);
                                if (!(arg2 < 4.0D) && arg2 > 4.2D && !(arg2 > 6.2D)) {
                                }
                            } else {
                                class32.field464[var24 - 1].method152(var18 - var19 / 2, -(var23 / 2) + var22, var19 * 2, var23 * 2);
                            }
                        }
                    }
                    class32.method222(false);
                }
            }
        }
        if (arg4 >= -74) {
            field378 = null;
        }
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(IIIIIIIII)V", line = 124)
    public final void method191(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = arg6 - arg3;
        int var11 = (arg8 - arg7 << 16) / var10;
        int var12 = arg0 - arg5;
        int var13 = (arg4 - arg2 << 16) / var12;
        for (int var14 = 0; var14 < var10; var14++) {
            int var15 = var11 * var14 >> 16;
            int var16 = (var14 + 1) * var11 >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                int var18 = arg7 + var15;
                class15.method109(arg5, -1216657178, arg3 + var14);
                int var19 = arg7 + var16;
                for (int var20 = 0; var20 < var12; var20++) {
                    int var21 = var13 * var20 >> 16;
                    int var22 = (var20 + 1) * var13 >> 16;
                    int var23 = var22 - var21;
                    if (var23 > 0) {
                        int var24 = arg2 + var21;
                        int var25 = arg2 + var22;
                        int var26 = class7.method63(-124);
                        int var27 = class25.method163((byte) 90);
                        if (var26 == 0 && var27 == 0) {
                            class17.method123(var18, var24, var19 - var18, -var24 + var25, class35.method232(17041));
                        } else {
                            byte var28 = class29.method211(arg1 + 16413);
                            int var29 = var28 & 0xFC;
                            if (var29 == 0 || var17 <= 1 || var23 <= 1) {
                                class17.method123(var18, var24, var17, var23, var26);
                            } else {
                                this.method195(true, var28 & 0x3, -117, var17, var26, class17.field180, class35.method232(arg1 ^ 0xFFFFFD02), class17.field181 * var24 + var18, var29 >> 2, var23);
                            }
                            if (var27 > 0) {
                                byte var30 = class21.method143(0);
                                int var31 = var30 & 0xFC;
                                if (var31 == 0 || var17 <= 1 || var23 <= 1) {
                                    class17.method123(var18, var24, var17, var23, var27);
                                }
                                this.method195(var26 == 0, var30 & 0x3, -127, var17, var27, class17.field180, class35.method232(arg1 ^ 0xFFFFFD02), class17.field181 * var24 + var18, var31 >> 2, var23);
                            }
                        }
                    }
                    class32.method222(false);
                }
            }
        }
        if (arg1 != -16493) {
            this.method190(9, -27, -2.409395613662137D, 24, 89, -105, 62, 83, -77, 112);
        }
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;B)I", line = 214)
    public static final int method192(KeyEvent arg0, byte arg1) {
        if (arg1 < 73) {
            return -67;
        }
        int var2 = arg0.getKeyChar();
        if (var2 <= 0 || var2 >= 256) {
            var2 = -1;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(DDDZ)I", line = 235)
    private final int method193(double arg0, double arg1, double arg2, boolean arg3) {
        double var8 = arg0;
        double var10 = arg0;
        double var12 = arg0;
        if (arg2 != 0.0D) {
            double var16;
            if (arg0 < 0.5D) {
                var16 = (arg2 + 1.0D) * arg0;
            } else {
                var16 = arg0 + arg2 - arg0 * arg2;
            }
            double var18 = arg0 * 2.0D - var16;
            if (arg1 * 6.0D < 1.0D) {
                var10 = (var16 - var18) * 6.0D * arg1 + var18;
            } else if (arg1 * 2.0D < 1.0D) {
                var10 = var16;
            } else if (arg1 * 3.0D < 2.0D) {
                var10 = (var16 - var18) * (-arg1 + 0.6666666666666666D) * 6.0D + var18;
            } else {
                var10 = var18;
            }
            double var20 = arg1 + 0.3333333333333333D;
            double var22 = arg1 - 0.3333333333333333D;
            if (var22 < 0.0D) {
                var22++;
            }
            if (var20 > 1.0D) {
                var20--;
            }
            if (var22 * 6.0D < 1.0D) {
                var12 = (var16 - var18) * 6.0D * var22 + var18;
            } else if (var22 * 2.0D < 1.0D) {
                var12 = var16;
            } else if (var22 * 3.0D < 2.0D) {
                var12 = (var16 - var18) * (-var22 + 0.6666666666666666D) * 6.0D + var18;
            } else {
                var12 = var18;
            }
            if (var20 * 6.0D < 1.0D) {
                var8 = (var16 - var18) * 6.0D * var20 + var18;
            } else if (var20 * 2.0D < 1.0D) {
                var8 = var16;
            } else if (var20 * 3.0D < 2.0D) {
                var8 = (0.6666666666666666D - var20) * (-var18 + var16) * 6.0D + var18;
            } else {
                var8 = var18;
            }
        }
        int var24 = (int) (var8 * 256.0D);
        int var25 = (int) (var10 * 256.0D);
        if (arg3) {
            return 57;
        } else {
            int var26 = (int) (var12 * 256.0D);
            return (var24 << 16) + (var25 << 8) + var26;
        }
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(IIB)V", line = 328)
    private final void method194(int arg0, int arg1, byte arg2) {
        int var4 = arg0 >> 6;
        int var5 = arg1 >> 6;
        class2.field12[3] = new byte[var5][var4][];
        class36.field497 = new class32[var5][var4];
        class2.field12[0] = new byte[var5][var4][];
        int var6 = -97 % ((1 - arg2) / 55);
        class2.field12[1] = new byte[var5][var4][];
        class2.field12[2] = new byte[var5][var4][];
        class32.field468 = new int[var5][var4][];
        class2.field12[4] = new byte[var5][var4][];
        class21.field203 = new class32[var5][var4];
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(ZIIII[IIIII)V", line = 362)
    private final void method195(boolean arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg8 == 9) {
            arg1 = arg1 + 1 & 0x3;
            arg8 = 1;
        }
        if (arg8 == 10) {
            arg8 = 1;
            arg1 = arg1 + 3 & 0x3;
        }
        if (arg8 == 11) {
            arg8 = 8;
            arg1 = arg1 + 3 & 0x3;
        }
        int var11 = class17.field181 - arg3;
        if (arg8 == 1) {
            if (arg1 == 0) {
                for (int var74 = 0; var74 < arg9; var74++) {
                    for (int var75 = 0; var75 < arg3; var75++) {
                        if (var74 >= var75) {
                            arg5[arg7] = arg4;
                        } else if (arg0) {
                            arg5[arg7] = arg6;
                        }
                        arg7++;
                    }
                    arg7 += var11;
                }
            } else if (arg1 == 1) {
                for (int var72 = arg9 - 1; var72 >= 0; var72--) {
                    for (int var73 = 0; var73 < arg3; var73++) {
                        if (var73 <= var72) {
                            arg5[arg7] = arg4;
                        } else if (arg0) {
                            arg5[arg7] = arg6;
                        }
                        arg7++;
                    }
                    arg7 += var11;
                }
            } else if (arg1 == 2) {
                for (int var70 = 0; var70 < arg9; var70++) {
                    for (int var71 = 0; var71 < arg3; var71++) {
                        if (var71 >= var70) {
                            arg5[arg7] = arg4;
                        } else if (arg0) {
                            arg5[arg7] = arg6;
                        }
                        arg7++;
                    }
                    arg7 += var11;
                }
            } else if (arg1 == 3) {
                for (int var68 = arg9 - 1; var68 >= 0; var68--) {
                    for (int var69 = 0; var69 < arg3; var69++) {
                        if (var68 <= var69) {
                            arg5[arg7] = arg4;
                        } else if (arg0) {
                            arg5[arg7] = arg6;
                        }
                        arg7++;
                    }
                    arg7 += var11;
                }
            }
        } else if (arg8 == 2) {
            if (arg1 == 0) {
                for (int var60 = arg9 - 1; var60 >= 0; var60--) {
                    for (int var61 = 0; var61 < arg3; var61++) {
                        if (var61 <= var60 >> 1) {
                            arg5[arg7] = arg4;
                        } else if (arg0) {
                            arg5[arg7] = arg6;
                        }
                        arg7++;
                    }
                    arg7 += var11;
                }
            } else if (arg1 == 1) {
                for (int var66 = 0; var66 < arg9; var66++) {
                    for (int var67 = 0; var67 < arg3; var67++) {
                        if (var66 << 1 <= var67) {
                            arg5[arg7] = arg4;
                        } else if (arg0) {
                            arg5[arg7] = arg6;
                        }
                        arg7++;
                    }
                    arg7 += var11;
                }
            } else if (arg1 == 2) {
                for (int var62 = 0; var62 < arg9; var62++) {
                    for (int var63 = arg3 - 1; var63 >= 0; var63--) {
                        if (var62 >> 1 >= var63) {
                            arg5[arg7] = arg4;
                        } else if (arg0) {
                            arg5[arg7] = arg6;
                        }
                        arg7++;
                    }
                    arg7 += var11;
                }
            } else if (arg1 == 3) {
                for (int var64 = arg9 - 1; var64 >= 0; var64--) {
                    for (int var65 = arg3 - 1; var65 >= 0; var65--) {
                        if (var65 >= var64 << 1) {
                            arg5[arg7] = arg4;
                        } else if (arg0) {
                            arg5[arg7] = arg6;
                        }
                        arg7++;
                    }
                    arg7 += var11;
                }
            }
        } else if (arg8 == 3) {
            if (arg1 == 0) {
                for (int var18 = arg9 - 1; var18 >= 0; var18--) {
                    for (int var19 = arg3 - 1; var19 >= 0; var19--) {
                        if (var19 <= var18 >> 1) {
                            arg5[arg7] = arg4;
                        } else if (arg0) {
                            arg5[arg7] = arg6;
                        }
                        arg7++;
                    }
                    arg7 += var11;
                }
            } else if (arg1 == 1) {
                for (int var16 = arg9 - 1; var16 >= 0; var16--) {
                    for (int var17 = 0; var17 < arg3; var17++) {
                        if (var16 << 1 <= var17) {
                            arg5[arg7] = arg4;
                        } else if (arg0) {
                            arg5[arg7] = arg6;
                        }
                        arg7++;
                    }
                    arg7 += var11;
                }
            } else if (arg1 == 2) {
                for (int var14 = 0; var14 < arg9; var14++) {
                    for (int var15 = 0; var15 < arg3; var15++) {
                        if (var14 >> 1 >= var15) {
                            arg5[arg7] = arg4;
                        } else if (arg0) {
                            arg5[arg7] = arg6;
                        }
                        arg7++;
                    }
                    arg7 += var11;
                }
            } else if (arg1 == 3) {
                for (int var12 = 0; var12 < arg9; var12++) {
                    for (int var13 = arg3 - 1; var13 >= 0; var13--) {
                        if (var13 >= var12 << 1) {
                            arg5[arg7] = arg4;
                        } else if (arg0) {
                            arg5[arg7] = arg6;
                        }
                        arg7++;
                    }
                    arg7 += var11;
                }
            }
        } else if (arg8 == 4) {
            if (arg1 == 0) {
                for (int var52 = arg9 - 1; var52 >= 0; var52--) {
                    for (int var53 = 0; var53 < arg3; var53++) {
                        if (var52 >> 1 <= var53) {
                            arg5[arg7] = arg4;
                        } else if (arg0) {
                            arg5[arg7] = arg6;
                        }
                        arg7++;
                    }
                    arg7 += var11;
                }
            } else if (arg1 == 1) {
                for (int var58 = 0; var58 < arg9; var58++) {
                    for (int var59 = 0; var59 < arg3; var59++) {
                        if (var59 <= var58 << 1) {
                            arg5[arg7] = arg4;
                        } else if (arg0) {
                            arg5[arg7] = arg6;
                        }
                        arg7++;
                    }
                    arg7 += var11;
                }
            } else if (arg1 == 2) {
                for (int var54 = 0; var54 < arg9; var54++) {
                    for (int var55 = arg3 - 1; var55 >= 0; var55--) {
                        if (var54 >> 1 <= var55) {
                            arg5[arg7] = arg4;
                        } else if (arg0) {
                            arg5[arg7] = arg6;
                        }
                        arg7++;
                    }
                    arg7 += var11;
                }
            } else if (arg1 == 3) {
                for (int var56 = arg9 - 1; var56 >= 0; var56--) {
                    for (int var57 = arg3 - 1; var57 >= 0; var57--) {
                        if (var56 << 1 >= var57) {
                            arg5[arg7] = arg4;
                        } else if (arg0) {
                            arg5[arg7] = arg6;
                        }
                        arg7++;
                    }
                    arg7 += var11;
                }
            }
        } else if (arg8 != 5) {
            if (arg8 == 6) {
                if (arg1 == 0) {
                    for (int var20 = 0; var20 < arg9; var20++) {
                        for (int var21 = 0; var21 < arg3; var21++) {
                            if (arg3 / 2 >= var21) {
                                arg5[arg7] = arg4;
                            } else if (arg0) {
                                arg5[arg7] = arg6;
                            }
                            arg7++;
                        }
                        arg7 += var11;
                    }
                    return;
                }
                if (arg1 == 1) {
                    for (int var42 = 0; var42 < arg9; var42++) {
                        for (int var43 = 0; var43 < arg3; var43++) {
                            if (var42 <= arg9 / 2) {
                                arg5[arg7] = arg4;
                            } else if (arg0) {
                                arg5[arg7] = arg6;
                            }
                            arg7++;
                        }
                        arg7 += var11;
                    }
                    return;
                }
                if (arg1 == 2) {
                    for (int var22 = 0; var22 < arg9; var22++) {
                        for (int var23 = 0; var23 < arg3; var23++) {
                            if (var23 >= arg3 / 2) {
                                arg5[arg7] = arg4;
                            } else if (arg0) {
                                arg5[arg7] = arg6;
                            }
                            arg7++;
                        }
                        arg7 += var11;
                    }
                    return;
                }
                if (arg1 == 3) {
                    for (int var24 = 0; var24 < arg9; var24++) {
                        for (int var25 = 0; var25 < arg3; var25++) {
                            if (arg9 / 2 <= var24) {
                                arg5[arg7] = arg4;
                            } else if (arg0) {
                                arg5[arg7] = arg6;
                            }
                            arg7++;
                        }
                        arg7 += var11;
                    }
                    return;
                }
            }
            if (arg8 == 7) {
                if (arg1 == 0) {
                    for (int var32 = 0; var32 < arg9; var32++) {
                        for (int var33 = 0; var33 < arg3; var33++) {
                            if (var33 <= var32 - arg9 / 2) {
                                arg5[arg7] = arg4;
                            } else if (arg0) {
                                arg5[arg7] = arg6;
                            }
                            arg7++;
                        }
                        arg7 += var11;
                    }
                    return;
                }
                if (arg1 == 1) {
                    for (int var26 = arg9 - 1; var26 >= 0; var26--) {
                        for (int var27 = 0; var27 < arg3; var27++) {
                            if (var27 <= var26 - arg9 / 2) {
                                arg5[arg7] = arg4;
                            } else if (arg0) {
                                arg5[arg7] = arg6;
                            }
                            arg7++;
                        }
                        arg7 += var11;
                    }
                    return;
                }
                if (arg1 == 2) {
                    for (int var30 = arg9 - 1; var30 >= 0; var30--) {
                        for (int var31 = arg3 - 1; var31 >= 0; var31--) {
                            if (var30 - arg9 / 2 >= var31) {
                                arg5[arg7] = arg4;
                            } else if (arg0) {
                                arg5[arg7] = arg6;
                            }
                            arg7++;
                        }
                        arg7 += var11;
                    }
                    return;
                }
                if (arg1 == 3) {
                    for (int var28 = 0; var28 < arg9; var28++) {
                        for (int var29 = arg3 - 1; var29 >= 0; var29--) {
                            if (var29 <= var28 - arg9 / 2) {
                                arg5[arg7] = arg4;
                            } else if (arg0) {
                                arg5[arg7] = arg6;
                            }
                            arg7++;
                        }
                        arg7 += var11;
                    }
                    return;
                }
            }
            if (arg8 == 8) {
                if (arg1 == 0) {
                    for (int var34 = 0; var34 < arg9; var34++) {
                        for (int var35 = 0; var35 < arg3; var35++) {
                            if (var35 >= var34 - arg9 / 2) {
                                arg5[arg7] = arg4;
                            } else if (arg0) {
                                arg5[arg7] = arg6;
                            }
                            arg7++;
                        }
                        arg7 += var11;
                    }
                    return;
                }
                if (arg1 == 1) {
                    for (int var36 = arg9 - 1; var36 >= 0; var36--) {
                        for (int var37 = 0; var37 < arg3; var37++) {
                            if (var37 >= var36 - arg9 / 2) {
                                arg5[arg7] = arg4;
                            } else if (arg0) {
                                arg5[arg7] = arg6;
                            }
                            arg7++;
                        }
                        arg7 += var11;
                    }
                    return;
                }
                if (arg1 == 2) {
                    for (int var40 = arg9 - 1; var40 >= 0; var40--) {
                        for (int var41 = arg3 - 1; var41 >= 0; var41--) {
                            if (var40 - arg9 / 2 <= var41) {
                                arg5[arg7] = arg4;
                            } else if (arg0) {
                                arg5[arg7] = arg6;
                            }
                            arg7++;
                        }
                        arg7 += var11;
                    }
                    return;
                }
                if (arg1 == 3) {
                    for (int var38 = 0; var38 < arg9; var38++) {
                        for (int var39 = arg3 - 1; var39 >= 0; var39--) {
                            if (var39 >= var38 - arg9 / 2) {
                                arg5[arg7] = arg4;
                            } else if (arg0) {
                                arg5[arg7] = arg6;
                            }
                            arg7++;
                        }
                        arg7 += var11;
                    }
                    return;
                }
            }
            if (arg2 >= -111) {
                this.method200(null, null, (byte) -85);
            }
        } else if (arg1 == 0) {
            for (int var50 = arg9 - 1; var50 >= 0; var50--) {
                for (int var51 = arg3 - 1; var51 >= 0; var51--) {
                    if (var51 >= var50 >> 1) {
                        arg5[arg7] = arg4;
                    } else if (arg0) {
                        arg5[arg7] = arg6;
                    }
                    arg7++;
                }
                arg7 += var11;
            }
        } else if (arg1 == 1) {
            for (int var48 = arg9 - 1; var48 >= 0; var48--) {
                for (int var49 = 0; var49 < arg3; var49++) {
                    if (var49 <= var48 << 1) {
                        arg5[arg7] = arg4;
                    } else if (arg0) {
                        arg5[arg7] = arg6;
                    }
                    arg7++;
                }
                arg7 += var11;
            }
        } else if (arg1 == 2) {
            for (int var46 = 0; var46 < arg9; var46++) {
                for (int var47 = 0; var47 < arg3; var47++) {
                    if (var46 >> 1 <= var47) {
                        arg5[arg7] = arg4;
                    } else if (arg0) {
                        arg5[arg7] = arg6;
                    }
                    arg7++;
                }
                arg7 += var11;
            }
        } else if (arg1 == 3) {
            for (int var44 = 0; var44 < arg9; var44++) {
                for (int var45 = arg3 - 1; var45 >= 0; var45--) {
                    if (var45 <= var44 << 1) {
                        arg5[arg7] = arg4;
                    } else if (arg0) {
                        arg5[arg7] = arg6;
                    }
                    arg7++;
                }
                arg7 += var11;
            }
        }
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(I)V", line = 1497)
    public static void method196(int arg0) {
        field373 = null;
        field369 = null;
        field378 = null;
        if (arg0 != -29956) {
            field380 = -89;
        }
        field370 = null;
        field381 = null;
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "([[BI)V", line = 1518)
    private final void method197(byte[][] arg0, int arg1) {
        int var3 = class8.field102;
        int var4 = class1.field4;
        int[] var5 = new int[var4];
        int var6 = 0;
        if (arg1 != 1776792532) {
            this.method197(null, -6);
        }
        while (var6 < var4) {
            var5[var6] = 0;
            var6++;
        }
        for (int var7 = 5; var7 < var3 - 5; var7++) {
            byte[] var8 = arg0[var7 + 5];
            byte[] var9 = arg0[var7 - 5];
            for (int var10 = 0; var10 < var4; var10++) {
                int var11 = class11.field112[var9[var10] & 0xFF];
                int var12 = class11.field112[var8[var10] & 0xFF];
                if (var12 <= 0 && class16.method118(true, var7 + 5, var10) > 0) {
                    var12 = 64;
                }
                if (var11 <= 0 && class16.method118(true, var7 - 5, var10) > 0) {
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
                    var13 += (var18 >> 20) - (var17 >> 20);
                    var15 += (var18 & 0x3FF) - (var17 & 0x3FF);
                    var14 += (var18 >> 10 & 0x3FF) - (var17 >> 10 & 0x3FF);
                    if (var15 > 0) {
                        int var19 = var7 >> 6;
                        int var20 = var16 >> 6;
                        if (class32.field468[var20][var19] == null) {
                            class32.field468[var20][var19] = new int[4096];
                        }
                        if ((arg0[var7][var16] & 0xFF) > 0) {
                            class32.field468[var20][var19][class21.method148(4032, var16 << 6) + class21.method148(63, var7)] = this.method193((double) var15 / 8533.0D, (double) var13 / 8533.0D, (double) var14 / 8533.0D, false);
                        } else {
                            class32.field468[var20][var19][(class21.method148(var16, 63) << 6) + class21.method148(63, var7)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(I[B)V", line = 1624)
    private final void method198(int arg0, byte[] arg1) {
        int var3 = arg0;
        while (true) {
            while (var3 < arg1.length) {
                int var4 = (arg1[var3++] & 0xFF) * 64 - field379;
                int var5 = (arg1[var3++] & 0xFF) * 64 - class31.field451;
                if (var4 > 0 && var5 > 0 && class8.field102 > var4 + 64 && class1.field4 > var5 + 64) {
                    for (int var6 = 0; var6 < 64; var6++) {
                        int var7 = class1.field4 - var5 - 1;
                        for (int var8 = -64; var8 < 0; var8++) {
                            while (true) {
                                int var9 = arg1[var3++] & 0xFF;
                                if (var9 == 0) {
                                    break;
                                }
                                if (var9 < 29) {
                                    class31.method217(0, var4 + var6, (byte) var9, class1.field4 - var5 - var8 - 64 - 1, -1);
                                } else if (var9 < 160) {
                                    class31.method217(1, var4 + var6, (byte) (var9 + -28), class1.field4 - var5 - var8 - 64 - 1, -1);
                                } else {
                                    class31.method217(2, var4 + var6, (byte) (var9 + -159), class1.field4 - var5 - var8 - 1 - 64, -1);
                                    if (class25.field237 >= 1500) {
                                        break;
                                    }
                                    this.field367[class25.field237] = var6 + var4;
                                    this.field377[class25.field237] = var7;
                                    this.field372[class25.field237] = var9 - 160;
                                    class25.field237++;
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

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(IIIIIIBII)V", line = 1752)
    public final void method199(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8) {
        int var10 = arg0 - arg5;
        if (arg6 != 83) {
            return;
        }
        int var11 = arg4 - arg3;
        this.field368 = 0;
        int var12 = (arg8 - arg2 << 16) / var10;
        int var13 = (arg1 - arg7 << 16) / var11;
        for (int var14 = 0; var14 < var10; var14++) {
            int var15 = var12 * var14 >> 16;
            int var16 = (var14 + 1) * var12 >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                class15.method109(arg3, -1216657178, var14 + arg5);
                for (int var18 = 0; var18 < var11; var18++) {
                    int var19 = var13 * var18 >> 16;
                    int var20 = (var18 + 1) * var13 >> 16;
                    int var21 = var20 - var19;
                    if (var21 > 0) {
                        int var22 = class16.method116(false) & 0xFF;
                        if (var22 != 0) {
                            int var23;
                            if (var21 == 1) {
                                var23 = var19;
                            } else {
                                var23 = var20 - 1;
                            }
                            int var24;
                            if (var17 == 1) {
                                var24 = var15;
                            } else {
                                var24 = var16 - 1;
                            }
                            int var25 = 13421772;
                            if (var22 >= 5 && var22 <= 8 || var22 >= 13 && var22 <= 16 || var22 >= 21 && var22 <= 24 || var22 == 27 || var22 == 28) {
                                var25 = 13369344;
                                var22 -= 4;
                            }
                            if (var22 == 1) {
                                class17.method129(var15, var19, var21, var25);
                            } else if (var22 == 2) {
                                class17.method122(var15, var19, var17, var25);
                            } else if (var22 == 3) {
                                class17.method129(var24, var19, var21, var25);
                            } else if (var22 == 4) {
                                class17.method122(var15, var23, var17, var25);
                            } else if (var22 == 9) {
                                class17.method129(var15, var19, var21, 16777215);
                                class17.method122(var15, var19, var17, var25);
                            } else if (var22 == 10) {
                                class17.method129(var24, var19, var21, 16777215);
                                class17.method122(var15, var19, var17, var25);
                            } else if (var22 == 11) {
                                class17.method129(var24, var19, var21, 16777215);
                                class17.method122(var15, var23, var17, var25);
                            } else if (var22 == 12) {
                                class17.method129(var15, var19, var21, 16777215);
                                class17.method122(var15, var23, var17, var25);
                            } else if (var22 == 17) {
                                class17.method122(var15, var19, 1, var25);
                            } else if (var22 == 18) {
                                class17.method122(var24, var19, 1, var25);
                            } else if (var22 == 19) {
                                class17.method122(var24, var23, 1, var25);
                            } else if (var22 == 20) {
                                class17.method122(var15, var23, 1, var25);
                            } else if (var22 == 25) {
                                for (int var27 = 0; var27 < var21; var27++) {
                                    class17.method122(var15 + var27, -var27 + var23, 1, var25);
                                }
                            } else if (var22 == 26) {
                                for (int var26 = 0; var26 < var21; var26++) {
                                    class17.method122(var15 + var26, var19 + var26, 1, var25);
                                }
                            }
                        }
                        int var28 = class14.method105((byte) 69) & 0xFF;
                        if (var28 != 0) {
                            this.field371[this.field368] = var28 - 1;
                            this.field374[this.field368] = var17 / 2 + var15;
                            this.field366[this.field368] = var21 / 2 + var19;
                            this.field368++;
                        }
                    }
                    class32.method222(false);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "([[B[BB)V", line = 1939)
    private final void method200(byte[][] arg0, byte[] arg1, byte arg2) {
        int var4 = 0;
        while (true) {
            while (arg1.length > var4) {
                int var5 = (arg1[var4++] & 0xFF) * 64 - field379;
                int var6 = (arg1[var4++] & 0xFF) * 64 - class31.field451;
                if (var5 > 0 && var6 > 0 && class8.field102 > var5 + 64 && class1.field4 > var6 + 64) {
                    for (int var7 = 0; var7 < 64; var7++) {
                        int var8 = class1.field4 - var6 - 1;
                        byte[] var9 = arg0[var7 + var5];
                        for (int var10 = -64; var10 < 0; var10++) {
                            var9[var8--] = arg1[var4++];
                        }
                    }
                } else {
                    var4 += 4096;
                }
            }
            if (arg2 != 76) {
                this.method200(null, null, (byte) 6);
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(Lb;I)V", line = 1988)
    public final void method201(class3 arg0, int arg1) {
        class37 var3 = new class37(arg0.method31(class21.field206, class11.field115, 0));
        int var4 = var3.method243((byte) -119);
        if (arg1 >= -11) {
            field381 = null;
        }
        int var5 = var3.method243((byte) -121);
        int var6 = var3.method243((byte) -124);
        int var7 = var3.method243((byte) -125);
        int var8 = var3.method243((byte) -127);
        int var9 = var3.method243((byte) -123);
        var3.method248(true);
        field379 = var4 * 64;
        class31.field451 = var5 * 64;
        class8.field102 = (var6 + 1 - var4) * 64;
        class1.field4 = (var7 - var5) * 64 + 64;
        class36.field499 = var8 * 64 - field379;
        field380 = class31.field451 + class1.field4 - var9 * 64;
        this.method194(class8.field102, class1.field4, (byte) 110);
        class37 var10 = new class37(arg0.method31(class21.field206, class30.field448, 0));
        int var11 = var10.method243((byte) -126);
        class11.field112 = new int[var11 + 1];
        for (int var12 = 0; var12 < var11; var12++) {
            class11.field112[var12 + 1] = var10.method244((byte) 117);
        }
        int var13 = var10.method243((byte) -117);
        class28.field415 = new int[var13 + 1];
        for (int var14 = 0; var14 < var13; var14++) {
            class28.field415[var14 + 1] = var10.method244((byte) 117);
        }
        byte[] var15 = arg0.method31(class21.field206, class11.field111, 0);
        byte[][] var16 = new byte[class8.field102][class1.field4];
        this.method200(var16, var15, (byte) 76);
        byte[] var17 = arg0.method31(class21.field206, class24.field229, 0);
        this.method203(true, var17);
        byte[] var18 = arg0.method31(class21.field206, class34.field486, 0);
        this.method205(65, var18);
        byte[] var19 = arg0.method31(class21.field206, class16.field169, 0);
        class25.field237 = 0;
        this.method198(0, var19);
        this.method197(var16, 1776792532);
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(IIIIIIIIIII)V", line = 2066)
    public final void method202(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (this.field368 == 0) {
            int var12 = arg8 - arg3;
            int var13 = arg7 - arg1;
            int var14 = (arg6 - arg2 << 16) / var12;
            int var15 = (arg10 - arg4 << 16) / var13;
            for (int var16 = 0; var16 < var12; var16++) {
                int var17 = var14 * var16 >> 16;
                int var18 = (var16 + 1) * var14 >> 16;
                int var19 = var18 - var17;
                if (var19 > 0) {
                    class15.method109(arg1, -1216657178, var16 + arg3);
                    for (int var20 = 0; var20 < var13; var20++) {
                        int var21 = var15 * var20 >> 16;
                        int var22 = (var20 + 1) * var15 >> 16;
                        int var23 = var22 - var21;
                        if (var23 > 0) {
                            int var24 = class14.method105((byte) 47) & 0xFF;
                            if (var24 != 0) {
                                this.field371[this.field368] = var24 - 1;
                                this.field374[this.field368] = var19 / 2 + var17;
                                this.field366[this.field368] = var23 / 2 + var21;
                                this.field368++;
                            }
                        }
                        class32.method222(false);
                    }
                }
            }
        }
        int var25 = -12 / ((arg0 - 78) / 33);
        for (int var26 = 0; var26 < this.field368; var26++) {
            if (class36.field496[this.field371[var26]] != null) {
                class36.field496[this.field371[var26]].method132(this.field374[var26] - 7, this.field366[var26] + -7);
            }
        }
        if (arg9 > 0) {
            for (int var27 = 0; var27 < this.field368; var27++) {
                if (this.field371[var27] == arg5) {
                    class36.field496[this.field371[var27]].method132(this.field374[var27] - 7, this.field366[var27] + -7);
                    if (arg9 % 10 < 5) {
                        class17.method127(this.field374[var27], this.field366[var27], 15, 16776960, 128);
                        class17.method127(this.field374[var27], this.field366[var27], 7, 16777215, 256);
                    }
                }
            }
        }
        this.field368 = 0;
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(Z[B)V", line = 2183)
    private final void method203(boolean arg0, byte[] arg1) {
        int var3 = 0;
        while (true) {
            while (arg1.length > var3) {
                int var4 = (arg1[var3++] & 0xFF) * 64 - field379;
                int var5 = (arg1[var3++] & 0xFF) * 64 - class31.field451;
                if (var4 > 0 && var5 > 0 && class8.field102 > var4 + 64 && class1.field4 > var5 + 64) {
                    class16.field158 = class1.field4 - var5 - 1 >> 6;
                    class34.field478 = var4 >> 6;
                    for (int var6 = 0; var6 < 64; var6++) {
                        for (int var7 = -64; var7 < 0; var7++) {
                            int var8 = arg1[var3++] & 0xFF;
                            if (var8 != 0) {
                                byte var9 = arg1[var3++];
                                class31.method217(3, var4 + var6, var9, class1.field4 - var7 - var5 - 1 - 64, -1);
                                if (class36.field497[class16.field158][class34.field478] == null) {
                                    class36.field497[class16.field158][class34.field478] = new class32();
                                    class36.field497[class16.field158][class34.field478].field461 = new byte[4096];
                                }
                                class36.field497[class16.field158][class34.field478].field461[(-(var7 + 1) << 6) + var6] = (byte) var8;
                            }
                        }
                    }
                    if (class36.field497[class16.field158][class34.field478] != null) {
                        class36.field497[class16.field158][class34.field478].method223(2544);
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
            if (!arg0) {
                field365 = 61;
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(ZIII)Ld;", line = 2262)
    private static final class7 method204(boolean arg0, int arg1, int arg2, int arg3) {
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        int var4 = 1;
        for (int var5 = arg3 / arg1; var5 != 0; var5 /= arg1) {
            var4++;
        }
        int var6 = var4;
        if (arg3 < 0 || arg0) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg3 < 0) {
            var7[0] = 45;
        } else if (arg0) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var9 = arg3 % arg1;
            arg3 /= arg1;
            if (var9 < 0) {
                var9 = -var9;
            }
            if (var9 > 9) {
                var9 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var9 + 48);
        }
        if (arg2 != -24723) {
            method196(-54);
        }
        class7 var10 = new class7();
        var10.field79 = var7;
        var10.field90 = var6;
        return var10;
    }

    @OriginalMember(owner = "mapview!na", name = "b", descriptor = "(I[B)V", line = 2335)
    private final void method205(int arg0, byte[] arg1) {
        if (arg0 != 65) {
            return;
        }
        int var3 = 0;
        while (true) {
            while (var3 < arg1.length) {
                int var4 = (arg1[var3++] & 0xFF) * 64 - field379;
                int var5 = (arg1[var3++] & 0xFF) * 64 - class31.field451;
                if (var4 > 0 && var5 > 0 && class8.field102 > var4 + 64 && var5 + 64 < class1.field4) {
                    class34.field478 = var4 >> 6;
                    class16.field158 = class1.field4 - var5 - 1 >> 6;
                    for (int var6 = 0; var6 < 64; var6++) {
                        for (int var7 = -64; var7 < 0; var7++) {
                            int var8 = arg1[var3++] & 0xFF;
                            if (var8 != 0) {
                                byte var9 = arg1[var3++];
                                class31.method217(4, var4 + var6, var9, class1.field4 - var5 - var7 - 65, -1);
                                if (class21.field203[class16.field158][class34.field478] == null) {
                                    class21.field203[class16.field158][class34.field478] = new class32();
                                    class21.field203[class16.field158][class34.field478].field461 = new byte[4096];
                                }
                                class21.field203[class16.field158][class34.field478].field461[(-(var7 + 1) << 6) + var6] = (byte) var8;
                            }
                        }
                    }
                    if (class21.field203[class16.field158][class34.field478] != null) {
                        class21.field203[class16.field158][class34.field478].method223(2544);
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

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(II)Ld;", line = 2418)
    public static final class7 method206(int arg0, int arg1) {
        return arg0 == 64 ? method204(false, 10, -24723, arg1) : (class7) null;
    }
}
