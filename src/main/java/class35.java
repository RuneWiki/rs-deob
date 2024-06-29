import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!sa")
public class class35 {

    @OriginalMember(owner = "mapview!sa", name = "f", descriptor = "[I")
    public int[] field480 = new int[1500];

    @OriginalMember(owner = "mapview!sa", name = "j", descriptor = "[I")
    private int[] field484 = new int[1500];

    @OriginalMember(owner = "mapview!sa", name = "e", descriptor = "[I")
    private int[] field479 = new int[1500];

    @OriginalMember(owner = "mapview!sa", name = "i", descriptor = "[I")
    public int[] field483 = new int[1500];

    @OriginalMember(owner = "mapview!sa", name = "g", descriptor = "[I")
    public int[] field481 = new int[1500];

    @OriginalMember(owner = "mapview!sa", name = "d", descriptor = "[I")
    private int[] field478 = new int[1500];

    @OriginalMember(owner = "mapview!sa", name = "m", descriptor = "I")
    private int field487 = 0;

    @OriginalMember(owner = "mapview!sa", name = "b", descriptor = "Lta;")
    public static class37 field476 = class20.method87(-92, "Chainmail Shop");

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "Lta;")
    public static class37 field475 = class20.method87(-96, "Next page");

    @OriginalMember(owner = "mapview!sa", name = "c", descriptor = "Lta;")
    public static class37 field477 = class20.method87(-94, "Amulet Shop");

    @OriginalMember(owner = "mapview!sa", name = "l", descriptor = "Lta;")
    public static class37 field486 = class20.method87(-84, "Achievement Start");

    @OriginalMember(owner = "mapview!sa", name = "k", descriptor = "[[B")
    public static byte[][] field485 = new byte[250][];

    @OriginalMember(owner = "mapview!sa", name = "h", descriptor = "Lta;")
    public static class37 field482 = class20.method87(-118, "Brewery");

    @OriginalMember(owner = "mapview!sa", name = "n", descriptor = "Lta;")
    private static class37 field488 = class20.method87(-90, "overlay2)3dat");

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "(ILf;)V", line = 10)
    public final void method200(int arg0, class10 arg1) {
        class21 var3 = new class21(arg1.method44(mapview.field341, -28255, class41.field534));
        int var4 = var3.method98(-2);
        int var5 = var3.method98(-2);
        int var6 = var3.method98(-2);
        int var7 = var3.method98(-2);
        int var8 = var3.method98(-2);
        int var9 = var3.method98(-2);
        var3.method91(-127);
        class14.field156 = var5 * 64;
        class37.field500 = (var7 - var5) * 64 + 64;
        int var10 = 127 / ((22 - arg0) / 52);
        class4.field41 = class37.field500 + class14.field156 - var9 * 64;
        class26.field424 = var4 * 64;
        class31.field458 = (var6 + 1 - var4) * 64;
        class21.field240 = var8 * 64 - class26.field424;
        this.method209((byte) -59, class37.field500, class31.field458);
        class21 var11 = new class21(arg1.method44(class15.field158, -28255, class41.field534));
        int var12 = var11.method98(-2);
        class5.field61 = new int[var12 + 1];
        for (int var13 = 0; var13 < var12; var13++) {
            class5.field61[var13 + 1] = var11.method100(-93);
        }
        int var14 = var11.method98(-2);
        class1.field10 = new int[var14 + 1];
        for (int var15 = 0; var15 < var14; var15++) {
            class1.field10[var15 + 1] = var11.method100(-78);
        }
        byte[] var16 = arg1.method44(class6.field66, -28255, class41.field534);
        byte[][] var17 = new byte[class31.field458][class37.field500];
        this.method206(var17, var16, (byte) -126);
        byte[] var18 = arg1.method44(class30.field448, -28255, class41.field534);
        this.method202(var18, -72);
        byte[] var19 = arg1.method44(field488, -28255, class41.field534);
        this.method212(var19, true);
        byte[] var20 = arg1.method44(class20.field230, -28255, class41.field534);
        class4.field53 = 0;
        this.method201(-23128, var20);
        this.method215(false, var17);
    }

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "(I[B)V", line = 78)
    private final void method201(int arg0, byte[] arg1) {
        int var3 = 0;
        while (true) {
            while (arg1.length > var3) {
                int var4 = (arg1[var3++] & 0xFF) * 64 - class26.field424;
                int var5 = (arg1[var3++] & 0xFF) * 64 - class14.field156;
                if (var4 > 0 && var5 > 0 && class31.field458 > var4 + 64 && class37.field500 > var5 + 64) {
                    for (int var6 = 0; var6 < 64; var6++) {
                        int var7 = class37.field500 - var5 - 1;
                        for (int var8 = -64; var8 < 0; var8++) {
                            while (true) {
                                int var9 = arg1[var3++] & 0xFF;
                                if (var9 == 0) {
                                    break;
                                }
                                if (var9 < 29) {
                                    class6.method29(-123, var4 + var6, (byte) var9, class37.field500 - var8 - var5 - 1 - 64, 0);
                                } else if (var9 < 160) {
                                    class6.method29(-111, var4 + var6, (byte) (var9 - 28), class37.field500 - var8 - var5 - 1 - 64, 1);
                                } else {
                                    class6.method29(-116, var4 + var6, (byte) (var9 + -159), class37.field500 - var5 - var8 - 1 - 64, 2);
                                    if (class4.field53 >= 1500) {
                                        break;
                                    }
                                    this.field483[class4.field53] = var4 + var6;
                                    this.field480[class4.field53] = var7;
                                    this.field481[class4.field53] = var9 - 160;
                                    class4.field53++;
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
            if (arg0 != -23128) {
                this.method216(-82, false, -30, -113, 88, 92, 123, -83, -118, -0.1663647145234716D);
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "([BI)V", line = 180)
    private final void method202(byte[] arg0, int arg1) {
        int var3 = 0;
        if (arg1 > -54) {
            this.field483 = null;
        }
        while (true) {
            while (var3 < arg0.length) {
                int var4 = (arg0[var3++] & 0xFF) * 64 - class26.field424;
                int var5 = (arg0[var3++] & 0xFF) * 64 - class14.field156;
                if (var4 > 0 && var5 > 0 && var4 + 64 < class31.field458 && var5 + 64 < class37.field500) {
                    class7.field81 = var4 >> 6;
                    class20.field228 = class37.field500 - var5 - 1 >> 6;
                    for (int var6 = 0; var6 < 64; var6++) {
                        for (int var7 = -64; var7 < 0; var7++) {
                            int var8 = arg0[var3++] & 0xFF;
                            if (var8 != 0) {
                                byte var9 = arg0[var3++];
                                class6.method29(-110, var4 + var6, var9, class37.field500 - var7 - var5 - 1 - 64, 3);
                                if (class10.field113[class20.field228][class7.field81] == null) {
                                    class10.field113[class20.field228][class7.field81] = new class27();
                                    class10.field113[class20.field228][class7.field81].field441 = new byte[4096];
                                }
                                class10.field113[class20.field228][class7.field81].field441[(-(var7 + 1) << 6) + var6] = (byte) var8;
                            }
                        }
                    }
                    if (class10.field113[class20.field228][class7.field81] != null) {
                        class10.field113[class20.field228][class7.field81].method173((byte) 116);
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

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "(B)Lc;", line = 261)
    public static final class4 method203(byte arg0) {
        if (arg0 != 50) {
            method207(49);
        }
        try {
            return (class4) Class.forName("b").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class7();
        }
    }

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "(IIIIIIZII[I)V", line = 275)
    private final void method204(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int[] arg9) {
        if (arg4 == 9) {
            arg4 = 1;
            arg2 = arg2 + 1 & 0x3;
        }
        if (arg4 == 10) {
            arg2 = arg2 + 3 & 0x3;
            arg4 = 1;
        }
        if (arg4 == 11) {
            arg2 = arg2 + 3 & 0x3;
            arg4 = 8;
        }
        if (arg3 != 28722) {
            this.field487 = 72;
        }
        int var11 = class22.field246 - arg8;
        if (arg4 == 1) {
            if (arg2 == 0) {
                for (int var18 = 0; var18 < arg1; var18++) {
                    for (int var19 = 0; var19 < arg8; var19++) {
                        if (var18 >= var19) {
                            arg9[arg7] = arg0;
                        } else if (arg6) {
                            arg9[arg7] = arg5;
                        }
                        arg7++;
                    }
                    arg7 += var11;
                }
            } else if (arg2 == 1) {
                for (int var12 = arg1 - 1; var12 >= 0; var12--) {
                    for (int var13 = 0; var13 < arg8; var13++) {
                        if (var13 <= var12) {
                            arg9[arg7] = arg0;
                        } else if (arg6) {
                            arg9[arg7] = arg5;
                        }
                        arg7++;
                    }
                    arg7 += var11;
                }
            } else if (arg2 == 2) {
                for (int var14 = 0; var14 < arg1; var14++) {
                    for (int var15 = 0; var15 < arg8; var15++) {
                        if (var14 <= var15) {
                            arg9[arg7] = arg0;
                        } else if (arg6) {
                            arg9[arg7] = arg5;
                        }
                        arg7++;
                    }
                    arg7 += var11;
                }
            } else if (arg2 == 3) {
                for (int var16 = arg1 - 1; var16 >= 0; var16--) {
                    for (int var17 = 0; var17 < arg8; var17++) {
                        if (var16 <= var17) {
                            arg9[arg7] = arg0;
                        } else if (arg6) {
                            arg9[arg7] = arg5;
                        }
                        arg7++;
                    }
                    arg7 += var11;
                }
            }
        } else if (arg4 == 2) {
            if (arg2 == 0) {
                for (int var26 = arg1 - 1; var26 >= 0; var26--) {
                    for (int var27 = 0; var27 < arg8; var27++) {
                        if (var26 >> 1 >= var27) {
                            arg9[arg7] = arg0;
                        } else if (arg6) {
                            arg9[arg7] = arg5;
                        }
                        arg7++;
                    }
                    arg7 += var11;
                }
            } else if (arg2 == 1) {
                for (int var24 = 0; var24 < arg1; var24++) {
                    for (int var25 = 0; var25 < arg8; var25++) {
                        if (var25 >= var24 << 1) {
                            arg9[arg7] = arg0;
                        } else if (arg6) {
                            arg9[arg7] = arg5;
                        }
                        arg7++;
                    }
                    arg7 += var11;
                }
            } else if (arg2 == 2) {
                for (int var20 = 0; var20 < arg1; var20++) {
                    for (int var21 = arg8 - 1; var21 >= 0; var21--) {
                        if (var20 >> 1 >= var21) {
                            arg9[arg7] = arg0;
                        } else if (arg6) {
                            arg9[arg7] = arg5;
                        }
                        arg7++;
                    }
                    arg7 += var11;
                }
            } else if (arg2 == 3) {
                for (int var22 = arg1 - 1; var22 >= 0; var22--) {
                    for (int var23 = arg8 - 1; var23 >= 0; var23--) {
                        if (var22 << 1 <= var23) {
                            arg9[arg7] = arg0;
                        } else if (arg6) {
                            arg9[arg7] = arg5;
                        }
                        arg7++;
                    }
                    arg7 += var11;
                }
            }
        } else if (arg4 == 3) {
            if (arg2 == 0) {
                for (int var28 = arg1 - 1; var28 >= 0; var28--) {
                    for (int var29 = arg8 - 1; var29 >= 0; var29--) {
                        if (var29 <= var28 >> 1) {
                            arg9[arg7] = arg0;
                        } else if (arg6) {
                            arg9[arg7] = arg5;
                        }
                        arg7++;
                    }
                    arg7 += var11;
                }
            } else if (arg2 == 1) {
                for (int var34 = arg1 - 1; var34 >= 0; var34--) {
                    for (int var35 = 0; var35 < arg8; var35++) {
                        if (var35 >= var34 << 1) {
                            arg9[arg7] = arg0;
                        } else if (arg6) {
                            arg9[arg7] = arg5;
                        }
                        arg7++;
                    }
                    arg7 += var11;
                }
            } else if (arg2 == 2) {
                for (int var32 = 0; var32 < arg1; var32++) {
                    for (int var33 = 0; var33 < arg8; var33++) {
                        if (var32 >> 1 >= var33) {
                            arg9[arg7] = arg0;
                        } else if (arg6) {
                            arg9[arg7] = arg5;
                        }
                        arg7++;
                    }
                    arg7 += var11;
                }
            } else if (arg2 == 3) {
                for (int var30 = 0; var30 < arg1; var30++) {
                    for (int var31 = arg8 - 1; var31 >= 0; var31--) {
                        if (var30 << 1 <= var31) {
                            arg9[arg7] = arg0;
                        } else if (arg6) {
                            arg9[arg7] = arg5;
                        }
                        arg7++;
                    }
                    arg7 += var11;
                }
            }
        } else if (arg4 == 4) {
            if (arg2 == 0) {
                for (int var42 = arg1 - 1; var42 >= 0; var42--) {
                    for (int var43 = 0; var43 < arg8; var43++) {
                        if (var42 >> 1 <= var43) {
                            arg9[arg7] = arg0;
                        } else if (arg6) {
                            arg9[arg7] = arg5;
                        }
                        arg7++;
                    }
                    arg7 += var11;
                }
            } else if (arg2 == 1) {
                for (int var40 = 0; var40 < arg1; var40++) {
                    for (int var41 = 0; var41 < arg8; var41++) {
                        if (var41 <= var40 << 1) {
                            arg9[arg7] = arg0;
                        } else if (arg6) {
                            arg9[arg7] = arg5;
                        }
                        arg7++;
                    }
                    arg7 += var11;
                }
            } else if (arg2 == 2) {
                for (int var36 = 0; var36 < arg1; var36++) {
                    for (int var37 = arg8 - 1; var37 >= 0; var37--) {
                        if (var37 >= var36 >> 1) {
                            arg9[arg7] = arg0;
                        } else if (arg6) {
                            arg9[arg7] = arg5;
                        }
                        arg7++;
                    }
                    arg7 += var11;
                }
            } else if (arg2 == 3) {
                for (int var38 = arg1 - 1; var38 >= 0; var38--) {
                    for (int var39 = arg8 - 1; var39 >= 0; var39--) {
                        if (var39 <= var38 << 1) {
                            arg9[arg7] = arg0;
                        } else if (arg6) {
                            arg9[arg7] = arg5;
                        }
                        arg7++;
                    }
                    arg7 += var11;
                }
            }
        } else if (arg4 != 5) {
            if (arg4 == 6) {
                if (arg2 == 0) {
                    for (int var50 = 0; var50 < arg1; var50++) {
                        for (int var51 = 0; var51 < arg8; var51++) {
                            if (var51 <= arg8 / 2) {
                                arg9[arg7] = arg0;
                            } else if (arg6) {
                                arg9[arg7] = arg5;
                            }
                            arg7++;
                        }
                        arg7 += var11;
                    }
                    return;
                }
                if (arg2 == 1) {
                    for (int var48 = 0; var48 < arg1; var48++) {
                        for (int var49 = 0; var49 < arg8; var49++) {
                            if (arg1 / 2 >= var48) {
                                arg9[arg7] = arg0;
                            } else if (arg6) {
                                arg9[arg7] = arg5;
                            }
                            arg7++;
                        }
                        arg7 += var11;
                    }
                    return;
                }
                if (arg2 == 2) {
                    for (int var44 = 0; var44 < arg1; var44++) {
                        for (int var45 = 0; var45 < arg8; var45++) {
                            if (arg8 / 2 <= var45) {
                                arg9[arg7] = arg0;
                            } else if (arg6) {
                                arg9[arg7] = arg5;
                            }
                            arg7++;
                        }
                        arg7 += var11;
                    }
                    return;
                }
                if (arg2 == 3) {
                    for (int var46 = 0; var46 < arg1; var46++) {
                        for (int var47 = 0; var47 < arg8; var47++) {
                            if (arg1 / 2 <= var46) {
                                arg9[arg7] = arg0;
                            } else if (arg6) {
                                arg9[arg7] = arg5;
                            }
                            arg7++;
                        }
                        arg7 += var11;
                    }
                    return;
                }
            }
            if (arg4 == 7) {
                if (arg2 == 0) {
                    for (int var52 = 0; var52 < arg1; var52++) {
                        for (int var53 = 0; var53 < arg8; var53++) {
                            if (var53 <= var52 - arg1 / 2) {
                                arg9[arg7] = arg0;
                            } else if (arg6) {
                                arg9[arg7] = arg5;
                            }
                            arg7++;
                        }
                        arg7 += var11;
                    }
                    return;
                }
                if (arg2 == 1) {
                    for (int var54 = arg1 - 1; var54 >= 0; var54--) {
                        for (int var55 = 0; var55 < arg8; var55++) {
                            if (var54 - arg1 / 2 >= var55) {
                                arg9[arg7] = arg0;
                            } else if (arg6) {
                                arg9[arg7] = arg5;
                            }
                            arg7++;
                        }
                        arg7 += var11;
                    }
                    return;
                }
                if (arg2 == 2) {
                    for (int var56 = arg1 - 1; var56 >= 0; var56--) {
                        for (int var57 = arg8 - 1; var57 >= 0; var57--) {
                            if (var56 - arg1 / 2 >= var57) {
                                arg9[arg7] = arg0;
                            } else if (arg6) {
                                arg9[arg7] = arg5;
                            }
                            arg7++;
                        }
                        arg7 += var11;
                    }
                    return;
                }
                if (arg2 == 3) {
                    for (int var58 = 0; var58 < arg1; var58++) {
                        for (int var59 = arg8 - 1; var59 >= 0; var59--) {
                            if (var58 - arg1 / 2 >= var59) {
                                arg9[arg7] = arg0;
                            } else if (arg6) {
                                arg9[arg7] = arg5;
                            }
                            arg7++;
                        }
                        arg7 += var11;
                    }
                    return;
                }
            }
            if (arg4 == 8) {
                if (arg2 == 0) {
                    for (int var60 = 0; var60 < arg1; var60++) {
                        for (int var61 = 0; var61 < arg8; var61++) {
                            if (var61 >= var60 - arg1 / 2) {
                                arg9[arg7] = arg0;
                            } else if (arg6) {
                                arg9[arg7] = arg5;
                            }
                            arg7++;
                        }
                        arg7 += var11;
                    }
                    return;
                }
                if (arg2 == 1) {
                    for (int var62 = arg1 - 1; var62 >= 0; var62--) {
                        for (int var63 = 0; var63 < arg8; var63++) {
                            if (var63 >= var62 - arg1 / 2) {
                                arg9[arg7] = arg0;
                            } else if (arg6) {
                                arg9[arg7] = arg5;
                            }
                            arg7++;
                        }
                        arg7 += var11;
                    }
                    return;
                }
                if (arg2 == 2) {
                    for (int var64 = arg1 - 1; var64 >= 0; var64--) {
                        for (int var65 = arg8 - 1; var65 >= 0; var65--) {
                            if (var64 - arg1 / 2 <= var65) {
                                arg9[arg7] = arg0;
                            } else if (arg6) {
                                arg9[arg7] = arg5;
                            }
                            arg7++;
                        }
                        arg7 += var11;
                    }
                    return;
                }
                if (arg2 == 3) {
                    for (int var66 = 0; var66 < arg1; var66++) {
                        for (int var67 = arg8 - 1; var67 >= 0; var67--) {
                            if (var66 - arg1 / 2 <= var67) {
                                arg9[arg7] = arg0;
                            } else if (arg6) {
                                arg9[arg7] = arg5;
                            }
                            arg7++;
                        }
                        arg7 += var11;
                    }
                    return;
                }
            }
        } else if (arg2 == 0) {
            for (int var68 = arg1 - 1; var68 >= 0; var68--) {
                for (int var69 = arg8 - 1; var69 >= 0; var69--) {
                    if (var69 >= var68 >> 1) {
                        arg9[arg7] = arg0;
                    } else if (arg6) {
                        arg9[arg7] = arg5;
                    }
                    arg7++;
                }
                arg7 += var11;
            }
        } else if (arg2 == 1) {
            for (int var74 = arg1 - 1; var74 >= 0; var74--) {
                for (int var75 = 0; var75 < arg8; var75++) {
                    if (var75 <= var74 << 1) {
                        arg9[arg7] = arg0;
                    } else if (arg6) {
                        arg9[arg7] = arg5;
                    }
                    arg7++;
                }
                arg7 += var11;
            }
        } else if (arg2 == 2) {
            for (int var70 = 0; var70 < arg1; var70++) {
                for (int var71 = 0; var71 < arg8; var71++) {
                    if (var70 >> 1 <= var71) {
                        arg9[arg7] = arg0;
                    } else if (arg6) {
                        arg9[arg7] = arg5;
                    }
                    arg7++;
                }
                arg7 += var11;
            }
        } else if (arg2 == 3) {
            for (int var72 = 0; var72 < arg1; var72++) {
                for (int var73 = arg8 - 1; var73 >= 0; var73--) {
                    if (var73 <= var72 << 1) {
                        arg9[arg7] = arg0;
                    } else if (arg6) {
                        arg9[arg7] = arg5;
                    }
                    arg7++;
                }
                arg7 += var11;
            }
        }
    }

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "(IIILfa;)[Lga;", line = 1400)
    public static final class13[] method205(int arg0, int arg1, int arg2, class11 arg3) {
        return class30.method175(arg2, arg3, arg1 ^ arg1, arg0) ? class27.method171(false) : null;
    }

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "([[B[BB)V", line = 1418)
    private final void method206(byte[][] arg0, byte[] arg1, byte arg2) {
        int var4 = 0;
        while (true) {
            while (arg1.length > var4) {
                int var5 = (arg1[var4++] & 0xFF) * 64 - class26.field424;
                int var6 = (arg1[var4++] & 0xFF) * 64 - class14.field156;
                if (var5 > 0 && var6 > 0 && class31.field458 > var5 + 64 && var6 + 64 < class37.field500) {
                    for (int var7 = 0; var7 < 64; var7++) {
                        byte[] var8 = arg0[var5 + var7];
                        int var9 = class37.field500 - var6 - 1;
                        for (int var10 = -64; var10 < 0; var10++) {
                            var8[var9--] = arg1[var4++];
                        }
                    }
                } else {
                    var4 += 4096;
                }
            }
            if (arg2 > -109) {
                this.method208(123, 105, -115, false, -114, -17, -53, -106, -21);
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "(I)B", line = 1476)
    private static final byte method207(int arg0) {
        if (arg0 <= 39) {
            field488 = null;
        }
        return class33.field461 == null ? 0 : class33.field461[class11.field127];
    }

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "(IIIZIIIII)V", line = 1490)
    public final void method208(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field487 = 0;
        int var10 = arg5 - arg6;
        int var11 = (arg1 - arg2 << 16) / var10;
        if (!arg3) {
            this.field480 = null;
        }
        int var12 = arg8 - arg4;
        int var13 = (arg7 - arg0 << 16) / var12;
        for (int var14 = 0; var14 < var10; var14++) {
            int var15 = var11 * var14 >> 16;
            int var16 = (var14 + 1) * var11 >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                class6.method23(23, arg4, var14 + arg6);
                for (int var18 = 0; var18 < var12; var18++) {
                    int var19 = (var18 + 1) * var13 >> 16;
                    int var20 = var13 * var18 >> 16;
                    int var21 = var19 - var20;
                    if (var21 > 0) {
                        int var22 = class36.method221(arg3) & 0xFF;
                        if (var22 != 0) {
                            int var23;
                            if (var17 == 1) {
                                var23 = var15;
                            } else {
                                var23 = var16 - 1;
                            }
                            int var24;
                            if (var21 == 1) {
                                var24 = var20;
                            } else {
                                var24 = var19 - 1;
                            }
                            int var25 = 13421772;
                            if (var22 >= 5 && var22 <= 8 || var22 >= 13 && var22 <= 16 || var22 >= 21 && var22 <= 24 || var22 == 27 || var22 == 28) {
                                var22 -= 4;
                                var25 = 13369344;
                            }
                            if (var22 == 1) {
                                class22.method110(var15, var20, var21, var25);
                            } else if (var22 == 2) {
                                class22.method112(var15, var20, var17, var25);
                            } else if (var22 == 3) {
                                class22.method110(var23, var20, var21, var25);
                            } else if (var22 == 4) {
                                class22.method112(var15, var24, var17, var25);
                            } else if (var22 == 9) {
                                class22.method110(var15, var20, var21, 16777215);
                                class22.method112(var15, var20, var17, var25);
                            } else if (var22 == 10) {
                                class22.method110(var23, var20, var21, 16777215);
                                class22.method112(var15, var20, var17, var25);
                            } else if (var22 == 11) {
                                class22.method110(var23, var20, var21, 16777215);
                                class22.method112(var15, var24, var17, var25);
                            } else if (var22 == 12) {
                                class22.method110(var15, var20, var21, 16777215);
                                class22.method112(var15, var24, var17, var25);
                            } else if (var22 == 17) {
                                class22.method112(var15, var20, 1, var25);
                            } else if (var22 == 18) {
                                class22.method112(var23, var20, 1, var25);
                            } else if (var22 == 19) {
                                class22.method112(var23, var24, 1, var25);
                            } else if (var22 == 20) {
                                class22.method112(var15, var24, 1, var25);
                            } else if (var22 == 25) {
                                for (int var26 = 0; var26 < var21; var26++) {
                                    class22.method112(var15 + var26, -var26 + var24, 1, var25);
                                }
                            } else if (var22 == 26) {
                                for (int var27 = 0; var27 < var21; var27++) {
                                    class22.method112(var15 + var27, var20 - -var27, 1, var25);
                                }
                            }
                        }
                        int var28 = class6.method22(1423028998) & 0xFF;
                        if (var28 != 0) {
                            this.field478[this.field487] = var28 - 1;
                            this.field479[this.field487] = var15 + var17 / 2;
                            this.field484[this.field487] = var21 / 2 + var20;
                            this.field487++;
                        }
                    }
                    class15.method62(false);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "(BII)V", line = 1667)
    private final void method209(byte arg0, int arg1, int arg2) {
        int var4 = arg2 >> 6;
        if (arg0 >= -43) {
            this.method202(null, -116);
        }
        int var5 = arg1 >> 6;
        class30.field444[2] = new byte[var5][var4][];
        class30.field444[1] = new byte[var5][var4][];
        class30.field444[4] = new byte[var5][var4][];
        class30.field444[0] = new byte[var5][var4][];
        class10.field113 = new class27[var5][var4];
        class30.field444[3] = new byte[var5][var4][];
        class26.field432 = new int[var5][var4][];
        class15.field160 = new class27[var5][var4];
    }

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "(IIIIIIIII)V", line = 1693)
    public final void method210(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = arg6 - arg8;
        int var11 = arg5 - arg0;
        int var12 = (arg7 - arg3 << 16) / var11;
        int var13 = (arg4 - arg2 << 16) / var10;
        for (int var14 = arg1; var14 < var10; var14++) {
            int var15 = var13 * var14 >> 16;
            int var16 = (var14 + 1) * var13 >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                class6.method23(-110, arg0, arg8 + var14);
                int var18 = arg2 + var15;
                int var19 = arg2 + var16;
                for (int var20 = 0; var20 < var11; var20++) {
                    int var21 = (var20 + 1) * var12 >> 16;
                    int var22 = var12 * var20 >> 16;
                    int var23 = var21 - var22;
                    if (var23 > 0) {
                        int var24 = class41.method264(arg1 ^ 0x0);
                        int var25 = arg3 + var21;
                        int var26 = arg3 + var22;
                        int var27 = mapview.method149(arg1 ^ 0x6F50);
                        if (var24 == 0 && var27 == 0) {
                            class22.method108(var18, var26, var19 - var18, -var26 + var25, class15.method63(true));
                        } else {
                            byte var28 = class25.method140(true);
                            int var29 = var28 & 0xFC;
                            if (var29 == 0 || var17 <= 1 || var23 <= 1) {
                                class22.method108(var18, var26, var17, var23, var24);
                            } else {
                                this.method204(var24, var23, var28 & 0x3, 28722, var29 >> 2, class15.method63(true), true, class22.field246 * var26 + var18, var17, class22.field249);
                            }
                            if (var27 > 0) {
                                byte var30 = class30.method181(arg1 ^ 0x77);
                                int var31 = var30 & 0xFC;
                                if (var31 == 0 || var17 <= 1 || var23 <= 1) {
                                    class22.method108(var18, var26, var17, var23, var27);
                                }
                                this.method204(var27, var23, var30 & 0x3, 28722, var31 >> 2, class15.method63(true), var24 == 0, class22.field246 * var26 + var18, var17, class22.field249);
                            }
                        }
                    }
                    class15.method62(false);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "(Z)V", line = 1794)
    public static void method211(boolean arg0) {
        field477 = null;
        field476 = null;
        field475 = null;
        field486 = null;
        field485 = null;
        if (arg0) {
            method207(43);
        }
        field482 = null;
        field488 = null;
    }

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "([BZ)V", line = 1816)
    private final void method212(byte[] arg0, boolean arg1) {
        int var3 = 0;
        if (!arg1) {
            this.field478 = null;
        }
        while (true) {
            while (arg0.length > var3) {
                int var4 = (arg0[var3++] & 0xFF) * 64 - class26.field424;
                int var5 = (arg0[var3++] & 0xFF) * 64 - class14.field156;
                if (var4 > 0 && var5 > 0 && var4 + 64 < class31.field458 && var5 + 64 < class37.field500) {
                    class7.field81 = var4 >> 6;
                    class20.field228 = class37.field500 - var5 - 1 >> 6;
                    for (int var6 = 0; var6 < 64; var6++) {
                        for (int var7 = -64; var7 < 0; var7++) {
                            int var8 = arg0[var3++] & 0xFF;
                            if (var8 != 0) {
                                byte var9 = arg0[var3++];
                                class6.method29(-121, var4 + var6, var9, class37.field500 - var5 - var7 - 64 - 1, 4);
                                if (class15.field160[class20.field228][class7.field81] == null) {
                                    class15.field160[class20.field228][class7.field81] = new class27();
                                    class15.field160[class20.field228][class7.field81].field441 = new byte[4096];
                                }
                                class15.field160[class20.field228][class7.field81].field441[(-(var7 + 1) << 6) + var6] = (byte) var8;
                            }
                        }
                    }
                    if (class15.field160[class20.field228][class7.field81] != null) {
                        class15.field160[class20.field228][class7.field81].method173((byte) 39);
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

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "(Lta;Lta;Lfa;I)[Lra;", line = 1898)
    public static final class34[] method213(class37 arg0, class37 arg1, class11 arg2, int arg3) {
        if (arg3 != 31605) {
            method207(-103);
        }
        int var4 = arg2.method43(arg1, (byte) -66);
        int var5 = arg2.method50(true, arg0, var4);
        return class26.method165(var5, arg2, var4, 0);
    }

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "(IIIIIIIIIII)V", line = 1920)
    public final void method214(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (this.field487 == 0) {
            int var12 = arg0 - arg7;
            int var13 = arg9 - arg10;
            int var14 = (arg2 - arg8 << 16) / var12;
            int var15 = (arg6 - arg3 << 16) / var13;
            for (int var16 = 0; var16 < var12; var16++) {
                int var17 = var14 * var16 >> 16;
                int var18 = (var16 + 1) * var14 >> 16;
                int var19 = var18 - var17;
                if (var19 > 0) {
                    class6.method23(-119, arg10, arg7 + var16);
                    for (int var20 = 0; var20 < var13; var20++) {
                        int var21 = var15 * var20 >> 16;
                        int var22 = (var20 + 1) * var15 >> 16;
                        int var23 = var22 - var21;
                        if (var23 > 0) {
                            int var24 = class6.method22(1423028998) & 0xFF;
                            if (var24 != 0) {
                                this.field478[this.field487] = var24 - 1;
                                this.field479[this.field487] = var19 / 2 + var17;
                                this.field484[this.field487] = var23 / 2 + var21;
                                this.field487++;
                            }
                        }
                        class15.method62(false);
                    }
                }
            }
        }
        if (arg5 <= 17) {
            this.method209((byte) 62, 21, 38);
        }
        for (int var25 = 0; var25 < this.field487; var25++) {
            if (mapview.field331[this.field478[var25]] != null) {
                mapview.field331[this.field478[var25]].method57(this.field479[var25] - 7, this.field484[var25] - 7);
            }
        }
        if (arg1 > 0) {
            for (int var26 = 0; var26 < this.field487; var26++) {
                if (this.field478[var26] == arg4) {
                    mapview.field331[this.field478[var26]].method57(this.field479[var26] - 7, this.field484[var26] - 7);
                    if (arg1 % 10 < 5) {
                        class22.method104(this.field479[var26], this.field484[var26], 15, 16776960, 128);
                        class22.method104(this.field479[var26], this.field484[var26], 7, 16777215, 256);
                    }
                }
            }
        }
        this.field487 = 0;
    }

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "(Z[[B)V", line = 2031)
    private final void method215(boolean arg0, byte[][] arg1) {
        int var3 = class31.field458;
        int var4 = class37.field500;
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = 0;
        }
        for (int var7 = 5; var7 < var3 - 5; var7++) {
            byte[] var8 = arg1[var7 + 5];
            byte[] var9 = arg1[var7 - 5];
            for (int var10 = 0; var10 < var4; var10++) {
                int var11 = class5.field61[var8[var10] & 0xFF];
                int var12 = class5.field61[var9[var10] & 0xFF];
                if (var11 <= 0 && class6.method30(true, var7 + 5, var10) > 0) {
                    var11 = 64;
                }
                if (var12 <= 0 && class6.method30(!arg0, var7 - 5, var10) > 0) {
                    var12 = 64;
                }
                var5[var10] += var11 - var12;
            }
            if (var7 > 10 && var3 - 10 > var7) {
                int var13 = 0;
                int var14 = 0;
                int var15 = 0;
                for (int var16 = 5; var16 < var4 - 5; var16++) {
                    int var17 = var5[var16 + 5];
                    int var18 = var5[var16 - 5];
                    var14 += (var17 >> 10 & 0x3FF) - ((var18 & 0xFFDB6) >> 10);
                    var15 += (var17 & 0x3FF) - (var18 & 0x3FF);
                    var13 += (var17 >> 20) - (var18 >> 20);
                    if (var15 > 0) {
                        int var19 = var16 >> 6;
                        int var20 = var7 >> 6;
                        if (class26.field432[var19][var20] == null) {
                            class26.field432[var19][var20] = new int[4096];
                        }
                        if ((arg1[var7][var16] & 0xFF) <= 0) {
                            class26.field432[var19][var20][(class10.method40(63, var16) << 6) + class10.method40(var7, 63)] = 0;
                        } else {
                            class26.field432[var19][var20][class10.method40(var7, 63) + class10.method40(4032, var16 << 6)] = this.method217((double) var14 / 8533.0D, (double) var15 / 8533.0D, 111, (double) var13 / 8533.0D);
                        }
                    }
                }
            }
        }
        if (arg0) {
            this.method204(-68, 67, 22, 112, 82, 64, true, -10, -43, null);
        }
    }

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "(IZIIIIIIID)V", line = 2135)
    public final void method216(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, double arg9) {
        if (arg1) {
            return;
        }
        int var12 = arg3 - arg0;
        int var13 = arg7 - arg2;
        int var14 = (arg8 - arg6 << 16) / var12;
        int var15 = (arg4 - arg5 << 16) / var13;
        if (arg4 - arg5 < -arg2 + arg7) {
            return;
        }
        this.field487 = 0;
        for (int var16 = 0; var16 < var13; var16++) {
            int var17 = var15 * var16 >> 16;
            int var18 = (var16 + 1) * var15 >> 16;
            int var19 = var18 - var17;
            if (var19 > 0) {
                class6.method23(-117, arg0, arg2 + var16);
                for (int var20 = 0; var20 < var12; var20++) {
                    int var21 = var14 * var20 >> 16;
                    int var22 = (var20 + 1) * var14 >> 16;
                    int var23 = var22 - var21;
                    if (var23 > 0) {
                        int var24 = method207(76) & 0xFF;
                        if (var24 != 0) {
                            if (var24 == 47 || var24 == 53) {
                                class9.field101[var24 - 1].method195(var17, var21, var19 * 2 + 1, var23 * 2 + 1);
                                if (!(arg9 < 4.0D) && arg9 > 4.2D && !(arg9 > 6.2D)) {
                                }
                            } else {
                                class9.field101[var24 - 1].method195(var17 - var19 / 2, -(var23 / 2) + var21, var19 * 2, var23 * 2);
                            }
                        }
                    }
                    class15.method62(false);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "(DDID)I", line = 2292)
    private final int method217(double arg0, double arg1, int arg2, double arg3) {
        double var8 = arg1;
        double var10 = arg1;
        double var12 = arg1;
        if (arg0 != 0.0D) {
            double var14;
            if (arg1 < 0.5D) {
                var14 = (arg0 + 1.0D) * arg1;
            } else {
                var14 = arg0 + arg1 - arg0 * arg1;
            }
            double var16 = arg3 + 0.3333333333333333D;
            double var18 = arg1 * 2.0D - var14;
            if (var16 > 1.0D) {
                var16--;
            }
            double var20 = arg3 - 0.3333333333333333D;
            if (var20 < 0.0D) {
                var20++;
            }
            if (var16 * 6.0D < 1.0D) {
                var10 = (var14 - var18) * 6.0D * var16 + var18;
            } else if (var16 * 2.0D < 1.0D) {
                var10 = var14;
            } else if (var16 * 3.0D < 2.0D) {
                var10 = (0.6666666666666666D - var16) * (-var18 + var14) * 6.0D + var18;
            } else {
                var10 = var18;
            }
            if (var20 * 6.0D < 1.0D) {
                var12 = (var14 - var18) * 6.0D * var20 + var18;
            } else if (var20 * 2.0D < 1.0D) {
                var12 = var14;
            } else if (var20 * 3.0D < 2.0D) {
                var12 = (var14 - var18) * (-var20 + 0.6666666666666666D) * 6.0D + var18;
            } else {
                var12 = var18;
            }
            if (arg3 * 6.0D < 1.0D) {
                var8 = (var14 - var18) * 6.0D * arg3 + var18;
            } else if (arg3 * 2.0D < 1.0D) {
                var8 = var14;
            } else if (arg3 * 3.0D < 2.0D) {
                var8 = (var14 - var18) * (-arg3 + 0.6666666666666666D) * 6.0D + var18;
            } else {
                var8 = var18;
            }
        }
        if (arg2 < 75) {
            method213(null, null, null, 26);
        }
        int var24 = (int) (var10 * 256.0D);
        int var25 = (int) (var8 * 256.0D);
        int var26 = (int) (var12 * 256.0D);
        return (var25 << 8) + (var24 << 16) + var26;
    }
}
