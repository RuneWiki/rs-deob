import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ma")
public class class25 {

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "I")
    private int field250 = 0;

    @OriginalMember(owner = "mapview!ma", name = "c", descriptor = "[I")
    private int[] field252 = new int[1500];

    @OriginalMember(owner = "mapview!ma", name = "e", descriptor = "[I")
    public int[] field254 = new int[1500];

    @OriginalMember(owner = "mapview!ma", name = "j", descriptor = "[I")
    private int[] field259 = new int[1500];

    @OriginalMember(owner = "mapview!ma", name = "b", descriptor = "[I")
    public int[] field251 = new int[1500];

    @OriginalMember(owner = "mapview!ma", name = "m", descriptor = "[I")
    public int[] field262 = new int[1500];

    @OriginalMember(owner = "mapview!ma", name = "h", descriptor = "[I")
    private int[] field257 = new int[1500];

    @OriginalMember(owner = "mapview!ma", name = "d", descriptor = "Lua;")
    public static class41 field253 = class16.method86("_", true);

    @OriginalMember(owner = "mapview!ma", name = "i", descriptor = "Lua;")
    public static class41 field258 = class16.method86("Loading )3)3)3", true);

    @OriginalMember(owner = "mapview!ma", name = "f", descriptor = "Lua;")
    public static class41 field255 = class16.method86("Cooking Range", true);

    @OriginalMember(owner = "mapview!ma", name = "g", descriptor = "Lh;")
    public static class14 field256 = new class14();

    @OriginalMember(owner = "mapview!ma", name = "k", descriptor = "Lua;")
    public static class41 field260 = class16.method86("Shield Shop", true);

    @OriginalMember(owner = "mapview!ma", name = "l", descriptor = "Lua;")
    public static class41 field261 = class16.method86("fonts", true);

    @OriginalMember(owner = "mapview!ma", name = "n", descriptor = "Lua;")
    private static class41 field263 = class16.method86("overlay2)3dat", true);

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(B)V", line = 14)
    public static void method137(byte arg0) {
        field261 = null;
        field253 = null;
        field263 = null;
        field260 = null;
        field258 = null;
        if (arg0 <= 87) {
            method144(-77, -120, 6, null);
        }
        field255 = null;
        field256 = null;
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(Ln;I)V", line = 35)
    public final void method138(class26 arg0, int arg1) {
        class19 var3 = new class19(arg0.method251((byte) -118, class7.field82, class20.field186));
        int var4 = var3.method99(arg1 - 31209);
        int var5 = var3.method99(arg1 - 31209);
        int var6 = var3.method99(255);
        int var7 = var3.method99(255);
        int var8 = var3.method99(255);
        int var9 = var3.method99(255);
        var3.method104((byte) -43);
        class19.sizeZ = (var7 - var5) * 64 + 64;
        if (arg1 != 31464) {
            this.convertHsl(0.989872576653194D, 0.4629583891128936D, -2.0280391159673834D, (byte) -99);
        }
        class8.sizeX = (var6 - var4) * 64 + 64;
        class13.originX = var4 * 64;
        class10.field103 = var8 * 64 - class13.originX;
        class26.originZ = var5 * 64;
        class14.field129 = class26.originZ + class19.sizeZ - var9 * 64;
        this.method151(arg1 ^ 0xFFFF850A, class8.sizeX, class19.sizeZ);
        class19 var10 = new class19(arg0.method251((byte) -110, class20.field174, class20.field186));
        int var11 = var10.method99(255);
        class20.field175 = new int[var11 + 1];
        for (int var12 = 0; var12 < var11; var12++) {
            class20.field175[var12 + 1] = var10.method105(class37.method206(arg1, -31404));
        }
        int var13 = var10.method99(arg1 ^ 0x7A17);
        class1.field1 = new int[var13 + 1];
        for (int var14 = 0; var14 < var13; var14++) {
            class1.field1[var14 + 1] = var10.method105(arg1 - 31374);
        }
        byte[] var15 = arg0.method251((byte) -121, class17.field153, class20.field186);
        byte[][] var16 = new byte[class8.sizeX][class19.sizeZ];
        this.method149(var16, (byte) -51, var15);
        byte[] var17 = arg0.method251((byte) -107, class41.field502, class20.field186);
        this.method142(var17, (byte) -93);
        byte[] var18 = arg0.method251((byte) -123, field263, class20.field186);
        this.method140(true, var18);
        byte[] var19 = arg0.method251((byte) -121, class3.field52, class20.field186);
        class19.field170 = 0;
        this.readLocData((byte) -73, var19);
        this.averageUnderlayColors(16857, var16);
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(DDDB)I", line = 114)
    private final int convertHsl(double arg0, double arg1, double arg2, byte arg3) {
        double var8 = arg2;
        if (arg3 <= 1) {
            method144(47, 45, -25, null);
        }
        double var10 = arg2;
        double var12 = arg2;
        if (arg1 != 0.0D) {
            double var14;
            if (arg2 < 0.5D) {
                var14 = (arg1 + 1.0D) * arg2;
            } else {
                var14 = arg1 + arg2 - arg1 * arg2;
            }
            double var16 = arg2 * 2.0D - var14;
            if (arg0 * 6.0D < 1.0D) {
                var8 = (var14 - var16) * 6.0D * arg0 + var16;
            } else if (arg0 * 2.0D < 1.0D) {
                var8 = var14;
            } else if (arg0 * 3.0D < 2.0D) {
                var8 = (var14 - var16) * (-arg0 + 0.6666666666666666D) * 6.0D + var16;
            } else {
                var8 = var16;
            }
            double var20 = arg0 - 0.3333333333333333D;
            if (var20 < 0.0D) {
                var20++;
            }
            if (var20 * 6.0D < 1.0D) {
                var12 = (var14 - var16) * 6.0D * var20 + var16;
            } else if (var20 * 2.0D < 1.0D) {
                var12 = var14;
            } else if (var20 * 3.0D < 2.0D) {
                var12 = (var14 - var16) * (-var20 + 0.6666666666666666D) * 6.0D + var16;
            } else {
                var12 = var16;
            }
            double var22 = arg0 + 0.3333333333333333D;
            if (var22 > 1.0D) {
                var22--;
            }
            if (var22 * 6.0D < 1.0D) {
                var10 = (var14 - var16) * 6.0D * var22 + var16;
            } else if (var22 * 2.0D < 1.0D) {
                var10 = var14;
            } else if (var22 * 3.0D < 2.0D) {
                var10 = (var14 - var16) * (-var22 + 0.6666666666666666D) * 6.0D + var16;
            } else {
                var10 = var16;
            }
        }
        int var24 = (int) (var10 * 256.0D);
        int var25 = (int) (var8 * 256.0D);
        int var26 = (int) (var12 * 256.0D);
        return (var24 << 16) + (var25 << 8) + var26;
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(Z[B)V", line = 217)
    private final void method140(boolean arg0, byte[] arg1) {
        if (!arg0) {
            return;
        }
        int var3 = 0;
        while (true) {
            while (var3 < arg1.length) {
                int var4 = (arg1[var3++] & 0xFF) * 64 - class13.originX;
                int var5 = (arg1[var3++] & 0xFF) * 64 - class26.originZ;
                if (var4 > 0 && var5 > 0 && class8.sizeX > var4 + 64 && var5 + 64 < class19.sizeZ) {
                    class16.field143 = var4 >> 6;
                    class8.field91 = class19.sizeZ - var5 - 1 >> 6;
                    for (int var6 = 0; var6 < 64; var6++) {
                        for (int var7 = -64; var7 < 0; var7++) {
                            int var8 = arg1[var3++] & 0xFF;
                            if (var8 != 0) {
                                byte var9 = arg1[var3++];
                                class36.method204(4, var9, var4 + var6, -var7 - 1 + -var5 + -64 + class19.sizeZ, !arg0);
                                if (class39.field491[class8.field91][class16.field143] == null) {
                                    class39.field491[class8.field91][class16.field143] = new class32();
                                    class39.field491[class8.field91][class16.field143].field419 = new byte[4096];
                                }
                                class39.field491[class8.field91][class16.field143].field419[(-(var7 + 1) << 6) + var6] = (byte) var8;
                            }
                        }
                    }
                    if (class39.field491[class8.field91][class16.field143] != null) {
                        class39.field491[class8.field91][class16.field143].method194((byte) -125);
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

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(IIIIIIIII)V", line = 299)
    public final void method141(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = arg6 - arg3;
        if (arg2 >= -12) {
            field255 = null;
        }
        int var11 = (arg0 - arg1 << 16) / var10;
        int var12 = arg5 - arg4;
        int var13 = (arg8 - arg7 << 16) / var12;
        for (int var14 = 0; var14 < var10; var14++) {
            int var15 = var11 * var14 >> 16;
            int var16 = (var14 + 1) * var11 >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                int var18 = arg1 + var16;
                class16.method85(-123, arg4, arg3 + var14);
                int var19 = arg1 + var15;
                for (int var20 = 0; var20 < var12; var20++) {
                    int var21 = var13 * var20 >> 16;
                    int var22 = (var20 + 1) * var13 >> 16;
                    int var23 = var22 - var21;
                    if (var23 > 0) {
                        int var24 = arg7 + var21;
                        int var25 = arg7 + var22;
                        int var26 = class19.method96(-25680);
                        int var27 = class10.method55(255);
                        if (var26 == 0 && var27 == 0) {
                            class12.method73(var19, var24, var18 - var19, -var24 + var25, class23.method125(0));
                        } else {
                            byte var28 = class43.method254(true);
                            int var29 = var28 & 0xFC;
                            if (var29 == 0 || var17 <= 1 || var23 <= 1) {
                                class12.method73(var19, var24, var17, var23, var26);
                            } else {
                                this.method143(class12.field118 * var24 + var19, var28 & 0x3, class12.field115, class23.method125(0), var17, var26, (byte) -36, var29 >> 2, true, var23);
                            }
                            if (var27 > 0) {
                                byte var30 = class37.method211((byte) -96);
                                int var31 = var30 & 0xFC;
                                if (var31 == 0 || var17 <= 1 || var23 <= 1) {
                                    class12.method73(var19, var24, var17, var23, var27);
                                }
                                this.method143(class12.field118 * var24 + var19, var30 & 0x3, class12.field115, class23.method125(0), var17, var27, (byte) -108, var31 >> 2, var26 == 0, var23);
                            }
                        }
                    }
                    class39.method217(-108);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "([BB)V", line = 391)
    private final void method142(byte[] arg0, byte arg1) {
        if (arg1 > -20) {
            field256 = null;
        }
        int var3 = 0;
        while (true) {
            while (arg0.length > var3) {
                int var4 = (arg0[var3++] & 0xFF) * 64 - class13.originX;
                int var5 = (arg0[var3++] & 0xFF) * 64 - class26.originZ;
                if (var4 > 0 && var5 > 0 && class8.sizeX > var4 + 64 && var5 + 64 < class19.sizeZ) {
                    class16.field143 = var4 >> 6;
                    class8.field91 = class19.sizeZ - var5 - 1 >> 6;
                    for (int var6 = 0; var6 < 64; var6++) {
                        for (int var7 = -64; var7 < 0; var7++) {
                            int var8 = arg0[var3++] & 0xFF;
                            if (var8 != 0) {
                                byte var9 = arg0[var3++];
                                class36.method204(3, var9, var4 + var6, -var5 + -65 + class19.sizeZ + -var7, false);
                                if (class36.field452[class8.field91][class16.field143] == null) {
                                    class36.field452[class8.field91][class16.field143] = new class32();
                                    class36.field452[class8.field91][class16.field143].field419 = new byte[4096];
                                }
                                class36.field452[class8.field91][class16.field143].field419[(-(var7 + 1) << 6) + var6] = (byte) var8;
                            }
                        }
                    }
                    if (class36.field452[class8.field91][class16.field143] != null) {
                        class36.field452[class8.field91][class16.field143].method194((byte) -125);
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

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(II[IIIIBIZI)V", line = 474)
    private final void method143(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, boolean arg8, int arg9) {
        if (arg6 >= -1) {
            method148(null, null, 31, null, null);
        }
        if (arg7 == 9) {
            arg7 = 1;
            arg1 = arg1 + 1 & 0x3;
        }
        if (arg7 == 10) {
            arg1 = arg1 + 3 & 0x3;
            arg7 = 1;
        }
        if (arg7 == 11) {
            arg1 = arg1 + 3 & 0x3;
            arg7 = 8;
        }
        int var11 = class12.field118 - arg4;
        if (arg7 == 1) {
            if (arg1 == 0) {
                for (int var18 = 0; var18 < arg9; var18++) {
                    for (int var19 = 0; var19 < arg4; var19++) {
                        if (var19 <= var18) {
                            arg2[arg0] = arg5;
                        } else if (arg8) {
                            arg2[arg0] = arg3;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg1 == 1) {
                for (int var12 = arg9 - 1; var12 >= 0; var12--) {
                    for (int var13 = 0; var13 < arg4; var13++) {
                        if (var12 >= var13) {
                            arg2[arg0] = arg5;
                        } else if (arg8) {
                            arg2[arg0] = arg3;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg1 == 2) {
                for (int var16 = 0; var16 < arg9; var16++) {
                    for (int var17 = 0; var17 < arg4; var17++) {
                        if (var16 <= var17) {
                            arg2[arg0] = arg5;
                        } else if (arg8) {
                            arg2[arg0] = arg3;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg1 == 3) {
                for (int var14 = arg9 - 1; var14 >= 0; var14--) {
                    for (int var15 = 0; var15 < arg4; var15++) {
                        if (var14 <= var15) {
                            arg2[arg0] = arg5;
                        } else if (arg8) {
                            arg2[arg0] = arg3;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            }
        } else if (arg7 == 2) {
            if (arg1 == 0) {
                for (int var74 = arg9 - 1; var74 >= 0; var74--) {
                    for (int var75 = 0; var75 < arg4; var75++) {
                        if (var75 <= var74 >> 1) {
                            arg2[arg0] = arg5;
                        } else if (arg8) {
                            arg2[arg0] = arg3;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg1 == 1) {
                for (int var68 = 0; var68 < arg9; var68++) {
                    for (int var69 = 0; var69 < arg4; var69++) {
                        if (var69 >= var68 << 1) {
                            arg2[arg0] = arg5;
                        } else if (arg8) {
                            arg2[arg0] = arg3;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg1 == 2) {
                for (int var72 = 0; var72 < arg9; var72++) {
                    for (int var73 = arg4 - 1; var73 >= 0; var73--) {
                        if (var72 >> 1 >= var73) {
                            arg2[arg0] = arg5;
                        } else if (arg8) {
                            arg2[arg0] = arg3;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg1 == 3) {
                for (int var70 = arg9 - 1; var70 >= 0; var70--) {
                    for (int var71 = arg4 - 1; var71 >= 0; var71--) {
                        if (var71 >= var70 << 1) {
                            arg2[arg0] = arg5;
                        } else if (arg8) {
                            arg2[arg0] = arg3;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            }
        } else if (arg7 == 3) {
            if (arg1 == 0) {
                for (int var26 = arg9 - 1; var26 >= 0; var26--) {
                    for (int var27 = arg4 - 1; var27 >= 0; var27--) {
                        if (var27 <= var26 >> 1) {
                            arg2[arg0] = arg5;
                        } else if (arg8) {
                            arg2[arg0] = arg3;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg1 == 1) {
                for (int var24 = arg9 - 1; var24 >= 0; var24--) {
                    for (int var25 = 0; var25 < arg4; var25++) {
                        if (var24 << 1 <= var25) {
                            arg2[arg0] = arg5;
                        } else if (arg8) {
                            arg2[arg0] = arg3;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg1 == 2) {
                for (int var20 = 0; var20 < arg9; var20++) {
                    for (int var21 = 0; var21 < arg4; var21++) {
                        if (var20 >> 1 >= var21) {
                            arg2[arg0] = arg5;
                        } else if (arg8) {
                            arg2[arg0] = arg3;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg1 == 3) {
                for (int var22 = 0; var22 < arg9; var22++) {
                    for (int var23 = arg4 - 1; var23 >= 0; var23--) {
                        if (var23 >= var22 << 1) {
                            arg2[arg0] = arg5;
                        } else if (arg8) {
                            arg2[arg0] = arg3;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            }
        } else if (arg7 == 4) {
            if (arg1 == 0) {
                for (int var60 = arg9 - 1; var60 >= 0; var60--) {
                    for (int var61 = 0; var61 < arg4; var61++) {
                        if (var61 >= var60 >> 1) {
                            arg2[arg0] = arg5;
                        } else if (arg8) {
                            arg2[arg0] = arg3;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg1 == 1) {
                for (int var66 = 0; var66 < arg9; var66++) {
                    for (int var67 = 0; var67 < arg4; var67++) {
                        if (var67 <= var66 << 1) {
                            arg2[arg0] = arg5;
                        } else if (arg8) {
                            arg2[arg0] = arg3;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg1 == 2) {
                for (int var62 = 0; var62 < arg9; var62++) {
                    for (int var63 = arg4 - 1; var63 >= 0; var63--) {
                        if (var62 >> 1 <= var63) {
                            arg2[arg0] = arg5;
                        } else if (arg8) {
                            arg2[arg0] = arg3;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg1 == 3) {
                for (int var64 = arg9 - 1; var64 >= 0; var64--) {
                    for (int var65 = arg4 - 1; var65 >= 0; var65--) {
                        if (var64 << 1 >= var65) {
                            arg2[arg0] = arg5;
                        } else if (arg8) {
                            arg2[arg0] = arg3;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            }
        } else if (arg7 != 5) {
            if (arg7 == 6) {
                if (arg1 == 0) {
                    for (int var28 = 0; var28 < arg9; var28++) {
                        for (int var29 = 0; var29 < arg4; var29++) {
                            if (var29 <= arg4 / 2) {
                                arg2[arg0] = arg5;
                            } else if (arg8) {
                                arg2[arg0] = arg3;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
                if (arg1 == 1) {
                    for (int var30 = 0; var30 < arg9; var30++) {
                        for (int var31 = 0; var31 < arg4; var31++) {
                            if (arg9 / 2 >= var30) {
                                arg2[arg0] = arg5;
                            } else if (arg8) {
                                arg2[arg0] = arg3;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
                if (arg1 == 2) {
                    for (int var34 = 0; var34 < arg9; var34++) {
                        for (int var35 = 0; var35 < arg4; var35++) {
                            if (arg4 / 2 <= var35) {
                                arg2[arg0] = arg5;
                            } else if (arg8) {
                                arg2[arg0] = arg3;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
                if (arg1 == 3) {
                    for (int var32 = 0; var32 < arg9; var32++) {
                        for (int var33 = 0; var33 < arg4; var33++) {
                            if (arg9 / 2 <= var32) {
                                arg2[arg0] = arg5;
                            } else if (arg8) {
                                arg2[arg0] = arg3;
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
                    for (int var50 = 0; var50 < arg9; var50++) {
                        for (int var51 = 0; var51 < arg4; var51++) {
                            if (var50 - arg9 / 2 >= var51) {
                                arg2[arg0] = arg5;
                            } else if (arg8) {
                                arg2[arg0] = arg3;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
                if (arg1 == 1) {
                    for (int var48 = arg9 - 1; var48 >= 0; var48--) {
                        for (int var49 = 0; var49 < arg4; var49++) {
                            if (var48 - arg9 / 2 >= var49) {
                                arg2[arg0] = arg5;
                            } else if (arg8) {
                                arg2[arg0] = arg3;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
                if (arg1 == 2) {
                    for (int var36 = arg9 - 1; var36 >= 0; var36--) {
                        for (int var37 = arg4 - 1; var37 >= 0; var37--) {
                            if (var36 - arg9 / 2 >= var37) {
                                arg2[arg0] = arg5;
                            } else if (arg8) {
                                arg2[arg0] = arg3;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
                if (arg1 == 3) {
                    for (int var46 = 0; var46 < arg9; var46++) {
                        for (int var47 = arg4 - 1; var47 >= 0; var47--) {
                            if (var46 - arg9 / 2 >= var47) {
                                arg2[arg0] = arg5;
                            } else if (arg8) {
                                arg2[arg0] = arg3;
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
                    for (int var38 = 0; var38 < arg9; var38++) {
                        for (int var39 = 0; var39 < arg4; var39++) {
                            if (var38 - arg9 / 2 <= var39) {
                                arg2[arg0] = arg5;
                            } else if (arg8) {
                                arg2[arg0] = arg3;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
                if (arg1 == 1) {
                    for (int var40 = arg9 - 1; var40 >= 0; var40--) {
                        for (int var41 = 0; var41 < arg4; var41++) {
                            if (var41 >= var40 - arg9 / 2) {
                                arg2[arg0] = arg5;
                            } else if (arg8) {
                                arg2[arg0] = arg3;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
                if (arg1 == 2) {
                    for (int var42 = arg9 - 1; var42 >= 0; var42--) {
                        for (int var43 = arg4 - 1; var43 >= 0; var43--) {
                            if (var42 - arg9 / 2 <= var43) {
                                arg2[arg0] = arg5;
                            } else if (arg8) {
                                arg2[arg0] = arg3;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
                if (arg1 == 3) {
                    for (int var44 = 0; var44 < arg9; var44++) {
                        for (int var45 = arg4 - 1; var45 >= 0; var45--) {
                            if (var45 >= var44 - arg9 / 2) {
                                arg2[arg0] = arg5;
                            } else if (arg8) {
                                arg2[arg0] = arg3;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
            }
        } else if (arg1 == 0) {
            for (int var52 = arg9 - 1; var52 >= 0; var52--) {
                for (int var53 = arg4 - 1; var53 >= 0; var53--) {
                    if (var52 >> 1 <= var53) {
                        arg2[arg0] = arg5;
                    } else if (arg8) {
                        arg2[arg0] = arg3;
                    }
                    arg0++;
                }
                arg0 += var11;
            }
        } else if (arg1 == 1) {
            for (int var54 = arg9 - 1; var54 >= 0; var54--) {
                for (int var55 = 0; var55 < arg4; var55++) {
                    if (var54 << 1 >= var55) {
                        arg2[arg0] = arg5;
                    } else if (arg8) {
                        arg2[arg0] = arg3;
                    }
                    arg0++;
                }
                arg0 += var11;
            }
        } else if (arg1 == 2) {
            for (int var56 = 0; var56 < arg9; var56++) {
                for (int var57 = 0; var57 < arg4; var57++) {
                    if (var57 >= var56 >> 1) {
                        arg2[arg0] = arg5;
                    } else if (arg8) {
                        arg2[arg0] = arg3;
                    }
                    arg0++;
                }
                arg0 += var11;
            }
        } else if (arg1 == 3) {
            for (int var58 = 0; var58 < arg9; var58++) {
                for (int var59 = arg4 - 1; var59 >= 0; var59--) {
                    if (var59 <= var58 << 1) {
                        arg2[arg0] = arg5;
                    } else if (arg8) {
                        arg2[arg0] = arg3;
                    }
                    arg0++;
                }
                arg0 += var11;
            }
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(IIILw;)Z", line = 1600)
    public static final boolean method144(int arg0, int arg1, int arg2, class43 arg3) {
        if (arg0 > -110) {
            method144(106, -23, -59, null);
        }
        byte[] var4 = arg3.method267(0, arg1, arg2);
        if (var4 == null) {
            return false;
        } else {
            class40.method221(true, var4);
            return true;
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(I[[B)V", line = 1617)
    private final void averageUnderlayColors(int arg0, byte[][] arg1) {
        int var3 = class8.sizeX;
        int var4 = class19.sizeZ;
        int[] var5 = new int[var4];
        if (arg0 != 16857) {
            method144(-114, 87, 90, null);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = 0;
        }
        for (int var7 = 5; var7 < var3 - 5; var7++) {
            byte[] var8 = arg1[var7 + 5];
            byte[] var9 = arg1[var7 - 5];
            for (int var10 = 0; var10 < var4; var10++) {
                int var11 = class20.field175[var9[var10] & 0xFF];
                int var12 = class20.field175[var8[var10] & 0xFF];
                if (var12 <= 0 && class8.method51((byte) 104, var10, var7 + 5) > 0) {
                    var12 = 64;
                }
                if (var11 <= 0 && class8.method51((byte) 77, var10, var7 - 5) > 0) {
                    var11 = 64;
                }
                var5[var10] += var12 - var11;
            }
            if (var7 > 10 && var3 - 10 > var7) {
                int var13 = 0;
                int var14 = 0;
                int var15 = 0;
                for (int var16 = 5; var16 < var4 - 5; var16++) {
                    int var17 = var5[var16 + 5];
                    int var18 = var5[var16 - 5];
                    var14 += (var17 >> 10 & 0x3FF) - ((var18 & 0xFFEA2) >> 10);
                    var13 += (var17 >> 20) - (var18 >> 20);
                    var15 += (var17 & 0x3FF) - (var18 & 0x3FF);
                    if (var15 > 0) {
                        int var19 = var7 >> 6;
                        int var20 = var16 >> 6;
                        if (class7.field80[var20][var19] == null) {
                            class7.field80[var20][var19] = new int[4096];
                        }
                        if ((arg1[var7][var16] & 0xFF) <= 0) {
                            class7.field80[var20][var19][class38.method213(var7, 63) + (class38.method213(63, var16) << 6)] = 0;
                        } else {
                            class7.field80[var20][var19][(class38.method213(var16, 63) << 6) + class38.method213(63, var7)] = this.convertHsl((double) var13 / 8533.0D, (double) var14 / 8533.0D, (double) var15 / 8533.0D, (byte) 6);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(IIIIIIDIBI)V", line = 1718)
    public final void method146(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, double arg6, int arg7, byte arg8, int arg9) {
        int var12 = arg0 - arg4;
        int var13 = arg5 - arg9;
        int var14 = (arg2 - arg7 << 16) / var13;
        int var15 = (arg1 - arg3 << 16) / var12;
        if (arg2 - arg7 < -arg9 + arg5) {
            return;
        }
        this.field250 = 0;
        if (arg8 >= -32) {
            return;
        }
        for (int var16 = 0; var16 < var13; var16++) {
            int var17 = (var16 + 1) * var14 >> 16;
            int var18 = var14 * var16 >> 16;
            int var19 = var17 - var18;
            if (var19 > 0) {
                class16.method85(109, arg4, arg9 + var16);
                for (int var20 = 0; var20 < var12; var20++) {
                    int var21 = var15 * var20 >> 16;
                    int var22 = (var20 + 1) * var15 >> 16;
                    int var23 = var22 - var21;
                    if (var23 > 0) {
                        int var24 = class40.method218(false) & 0xFF;
                        if (var24 != 0) {
                            if (var24 == 47 || var24 == 53) {
                                if (!(arg6 < 4.0D) && arg6 > 4.2D && arg6 > 6.2D) {
                                }
                                class21.field211[var24 - 1].method40(var18, var21, var19 * 2 + 1, var23 * 2 + 1);
                            } else {
                                class21.field211[var24 - 1].method40(var18 - var19 / 2, var21 - var23 / 2, var19 * 2, var23 * 2);
                            }
                        }
                    }
                    class39.method217(-94);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(IIIIIBIIIII)V", line = 1839)
    public final void method147(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (this.field250 == 0) {
            int var12 = arg2 - arg6;
            int var13 = (arg4 - arg1 << 16) / var12;
            int var14 = arg10 - arg0;
            int var15 = (arg8 - arg3 << 16) / var14;
            for (int var16 = 0; var16 < var14; var16++) {
                int var17 = var15 * var16 >> 16;
                int var18 = (var16 + 1) * var15 >> 16;
                int var19 = var18 - var17;
                if (var19 > 0) {
                    class16.method85(119, arg6, arg0 + var16);
                    for (int var20 = 0; var20 < var12; var20++) {
                        int var21 = var13 * var20 >> 16;
                        int var22 = (var20 + 1) * var13 >> 16;
                        int var23 = var22 - var21;
                        if (var23 > 0) {
                            int var24 = class37.method210((byte) -100) & 0xFF;
                            if (var24 != 0) {
                                this.field259[this.field250] = var24 - 1;
                                this.field252[this.field250] = var17 + var19 / 2;
                                this.field257[this.field250] = var23 / 2 + var21;
                                this.field250++;
                            }
                        }
                        class39.method217(-73);
                    }
                }
            }
        }
        if (arg5 <= 95) {
            return;
        }
        for (int var25 = 0; var25 < this.field250; var25++) {
            if (class37.field458[this.field259[var25]] != null) {
                class37.field458[this.field259[var25]].method91(this.field252[var25] - 7, this.field257[var25] + -7);
            }
        }
        if (arg7 > 0) {
            for (int var26 = 0; var26 < this.field250; var26++) {
                if (this.field259[var26] == arg9) {
                    class37.field458[this.field259[var26]].method91(this.field252[var26] - 7, this.field257[var26] + -7);
                    if (arg7 % 10 < 5) {
                        class12.method70(this.field252[var26], this.field257[var26], 15, 16776960, 128);
                        class12.method70(this.field252[var26], this.field257[var26], 7, 16777215, 256);
                    }
                }
            }
        }
        this.field250 = 0;
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(Lw;Lw;ILua;Lua;)Lna;", line = 1948)
    public static final class27 method148(class43 arg0, class43 arg1, int arg2, class41 arg3, class41 arg4) {
        int var5 = arg0.method256(arg3, -67);
        int var6 = arg0.method264(arg4, arg2 + 869, var5);
        if (arg2 != -1) {
            field261 = null;
        }
        return class4.method38(arg0, arg1, var6, var5, arg2 + 51);
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "([[BB[B)V", line = 1970)
    private final void method149(byte[][] arg0, byte arg1, byte[] arg2) {
        if (arg1 >= -33) {
            return;
        }
        int var4 = 0;
        while (true) {
            while (arg2.length > var4) {
                int var5 = (arg2[var4++] & 0xFF) * 64 - class13.originX;
                int var6 = (arg2[var4++] & 0xFF) * 64 - class26.originZ;
                if (var5 > 0 && var6 > 0 && class8.sizeX > var5 + 64 && class19.sizeZ > var6 + 64) {
                    for (int var7 = 0; var7 < 64; var7++) {
                        byte[] var8 = arg0[var5 + var7];
                        int var9 = class19.sizeZ - var6 - 1;
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

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(IIIBIIIII)V", line = 2027)
    public final void method150(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = 96 % ((arg3 + 63) / 54);
        int var11 = arg8 - arg4;
        this.field250 = 0;
        int var12 = arg7 - arg1;
        int var13 = (arg5 - arg2 << 16) / var11;
        int var14 = (arg0 - arg6 << 16) / var12;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = var14 * var15 >> 16;
            int var17 = (var15 + 1) * var14 >> 16;
            int var18 = var17 - var16;
            if (var18 > 0) {
                class16.method85(49, arg4, arg1 + var15);
                for (int var19 = 0; var19 < var11; var19++) {
                    int var20 = var13 * var19 >> 16;
                    int var21 = (var19 + 1) * var13 >> 16;
                    int var22 = var21 - var20;
                    if (var22 > 0) {
                        int var23 = class41.method238((byte) 112) & 0xFF;
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
                                var26 = 13369344;
                                var23 -= 4;
                            }
                            if (var23 == 1) {
                                class12.method64(var16, var20, var22, var26);
                            } else if (var23 == 2) {
                                class12.method65(var16, var20, var18, var26);
                            } else if (var23 == 3) {
                                class12.method64(var24, var20, var22, var26);
                            } else if (var23 == 4) {
                                class12.method65(var16, var25, var18, var26);
                            } else if (var23 == 9) {
                                class12.method64(var16, var20, var22, 16777215);
                                class12.method65(var16, var20, var18, var26);
                            } else if (var23 == 10) {
                                class12.method64(var24, var20, var22, 16777215);
                                class12.method65(var16, var20, var18, var26);
                            } else if (var23 == 11) {
                                class12.method64(var24, var20, var22, 16777215);
                                class12.method65(var16, var25, var18, var26);
                            } else if (var23 == 12) {
                                class12.method64(var16, var20, var22, 16777215);
                                class12.method65(var16, var25, var18, var26);
                            } else if (var23 == 17) {
                                class12.method65(var16, var20, 1, var26);
                            } else if (var23 == 18) {
                                class12.method65(var24, var20, 1, var26);
                            } else if (var23 == 19) {
                                class12.method65(var24, var25, 1, var26);
                            } else if (var23 == 20) {
                                class12.method65(var16, var25, 1, var26);
                            } else if (var23 == 25) {
                                for (int var28 = 0; var28 < var22; var28++) {
                                    class12.method65(var16 + var28, var25 - var28, 1, var26);
                                }
                            } else if (var23 == 26) {
                                for (int var27 = 0; var27 < var22; var27++) {
                                    class12.method65(var16 + var27, var20 - -var27, 1, var26);
                                }
                            }
                        }
                        int var29 = class37.method210((byte) -123) & 0xFF;
                        if (var29 != 0) {
                            this.field259[this.field250] = var29 - 1;
                            this.field252[this.field250] = var18 / 2 + var16;
                            this.field257[this.field250] = var20 + var22 / 2;
                            this.field250++;
                        }
                    }
                    class39.method217(-105);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(III)V", line = 2197)
    private final void method151(int arg0, int arg1, int arg2) {
        int var4 = arg1 >> 6;
        int var5 = arg2 >> 6;
        class39.field491 = new class32[var5][var4];
        class7.field80 = new int[var5][var4][];
        class16.field141[3] = new byte[var5][var4][];
        if (arg0 > -9) {
            field260 = null;
        }
        class36.field452 = new class32[var5][var4];
        class16.field141[1] = new byte[var5][var4][];
        class16.field141[0] = new byte[var5][var4][];
        class16.field141[4] = new byte[var5][var4][];
        class16.field141[2] = new byte[var5][var4][];
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(B[B)V", line = 2222)
    private final void readLocData(byte arg0, byte[] arg1) {
        int var3 = 0;
        int var4 = 32 / ((-arg0 - 14) / 58);
        while (true) {
            while (var3 < arg1.length) {
                int var5 = (arg1[var3++] & 0xFF) * 64 - class13.originX;
                int var6 = (arg1[var3++] & 0xFF) * 64 - class26.originZ;
                if (var5 > 0 && var6 > 0 && class8.sizeX > var5 + 64 && class19.sizeZ > var6 + 64) {
                    for (int var7 = 0; var7 < 64; var7++) {
                        int var8 = class19.sizeZ - var6 - 1;
                        for (int var9 = -64; var9 < 0; var9++) {
                            while (true) {
                                int var10 = arg1[var3++] & 0xFF;
                                if (var10 == 0) {
                                    break;
                                }
                                if (var10 < 29) {
                                    class36.method204(0, (byte) var10, var5 + var7, -var6 + -64 + class19.sizeZ - (var9 + 1), false);
                                } else if (var10 >= 160) {
                                    class36.method204(2, (byte) (var10 - 159), var5 + var7, -var6 + class19.sizeZ - 64 + -var9 + -1, false);
                                    if (class19.field170 >= 1500) {
                                        break;
                                    }
                                    this.field251[class19.field170] = var5 + var7;
                                    this.field262[class19.field170] = var8;
                                    this.field254[class19.field170] = var10 - 160;
                                    class19.field170++;
                                } else {
                                    class36.method204(1, (byte) (var10 - 28), var5 + var7, -var6 - 1 + class19.sizeZ + -64 + -var9, false);
                                }
                            }
                            var8--;
                        }
                    }
                } else {
                    for (int var11 = 0; var11 < 64; var11++) {
                        byte var13;
                        for (int var12 = -64; var12 < 0; var12++) {
                            do {
                                var13 = arg1[var3++];
                            } while (var13 != 0);
                        }
                    }
                }
            }
            return;
        }
    }
}
