import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!p")
public class class30 {

    @OriginalMember(owner = "mapview!p", name = "e", descriptor = "I")
    private int field406 = 0;

    @OriginalMember(owner = "mapview!p", name = "c", descriptor = "[I")
    private int[] field404 = new int[1500];

    @OriginalMember(owner = "mapview!p", name = "f", descriptor = "[I")
    private int[] field407 = new int[1500];

    @OriginalMember(owner = "mapview!p", name = "j", descriptor = "[I")
    private int[] field411 = new int[1500];

    @OriginalMember(owner = "mapview!p", name = "l", descriptor = "[I")
    private int[] field413 = new int[1500];

    @OriginalMember(owner = "mapview!p", name = "b", descriptor = "[I")
    private int[] field403 = new int[1500];

    @OriginalMember(owner = "mapview!p", name = "k", descriptor = "[I")
    private int[] field412 = new int[1500];

    @OriginalMember(owner = "mapview!p", name = "h", descriptor = "Lh;")
    public static class15 field409 = class26.method190(true, "map");

    @OriginalMember(owner = "mapview!p", name = "g", descriptor = "Lh;")
    public static class15 field408 = class26.method190(true, "Combat Training");

    @OriginalMember(owner = "mapview!p", name = "m", descriptor = "Lh;")
    public static class15 field414 = class26.method190(true, "world");

    @OriginalMember(owner = "mapview!p", name = "d", descriptor = "[B")
    public static byte[] field405;

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "[I")
    public static int[] field402;

    @OriginalMember(owner = "mapview!p", name = "i", descriptor = "[[Lo;")
    public static class28[][] field410;

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(B)B", line = 5)
    private static final byte method208(byte arg0) {
        if (arg0 >= -111) {
            return -66;
        } else if (class9.field152 == null) {
            return 0;
        } else {
            return class9.field152[class35.field442];
        }
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(IIIIIIIII)V", line = 26)
    public final void method209(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = arg7 - arg0;
        int var11 = arg5 - arg3;
        int var12 = (arg1 - arg2 << 16) / var10;
        int var13 = (arg6 - arg4 << 16) / var11;
        if (arg8 >= -7) {
            this.method211(105, null);
        }
        for (int var14 = 0; var14 < var11; var14++) {
            int var15 = var13 * var14 >> 16;
            int var16 = (var14 + 1) * var13 >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                int var18 = arg4 + var15;
                class14.method107(arg3 + var14, -3652, arg0);
                int var19 = arg4 + var16;
                for (int var20 = 0; var20 < var10; var20++) {
                    int var21 = var12 * var20 >> 16;
                    int var22 = (var20 + 1) * var12 >> 16;
                    int var23 = var22 - var21;
                    if (var23 > 0) {
                        int var24 = arg2 + var21;
                        int var25 = class14.method106(false);
                        int var26 = arg2 + var22;
                        int var27 = mapview.method8(255);
                        if (var25 == 0 && var27 == 0) {
                            class12.method94(var18, var24, var19 - var18, var26 - var24, class2.method34(-1));
                        } else {
                            byte var28 = mapview.method20(-60);
                            int var29 = var28 & 0xFC;
                            if (var29 == 0 || var17 <= 1 || var23 <= 1) {
                                class12.method94(var18, var24, var17, var23, var25);
                            } else {
                                this.method212(true, var25, (byte) 8, var29 >> 2, var28 & 0x3, var17, var23, class2.method34(-1), class12.field223 * var24 + var18, class12.field222);
                            }
                            if (var27 > 0) {
                                byte var30 = method213(-160);
                                int var31 = var30 & 0xFC;
                                if (var31 == 0 || var17 <= 1 || var23 <= 1) {
                                    class12.method94(var18, var24, var17, var23, var27);
                                }
                                this.method212(var25 == 0, var27, (byte) 8, var31 >> 2, var30 & 0x3, var17, var23, class2.method34(-1), class12.field223 * var24 + var18, class12.field222);
                            }
                        }
                    }
                    method214(0);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(Lv;B)V", line = 122)
    public final void method210(class35 arg0, byte arg1) {
        class18 var3 = new class18(arg0.method42((byte) 21, class16.field265, class26.field353));
        int var4 = var3.method157(-1);
        int var5 = var3.method157(-1);
        int var6 = var3.method157(-1);
        int var7 = var3.method157(-1);
        int var8 = var3.method157(-1);
        if (arg1 < 108) {
            this.method209(58, -6, 94, 103, 48, 52, 50, -22, 104);
        }
        int var9 = var3.method157(-1);
        var3.method147(-1992);
        class33.field438 = var5 * 64;
        class15.field254 = var4 * 64;
        class26.field350 = (var6 + 1 - var4) * 64;
        class18.field291 = (var7 + 1 - var5) * 64;
        class26.field355 = class33.field438 + class18.field291 - var9 * 64;
        class21.field305 = var8 * 64 - class15.field254;
        this.method221(class26.field350, (byte) 45, class18.field291);
        class18 var10 = new class18(arg0.method42((byte) 21, class36.field455, class26.field353));
        int var11 = var10.method157(-1);
        class26.field358 = new int[var11 + 1];
        for (int var12 = 0; var12 < var11; var12++) {
            class26.field358[var12 + 1] = var10.method156(127);
        }
        int var13 = var10.method157(-1);
        class25.field337 = new int[var13 + 1];
        for (int var14 = 0; var14 < var13; var14++) {
            class25.field337[var14 + 1] = var10.method156(127);
        }
        byte[] var15 = arg0.method42((byte) 21, class9.field150, class26.field353);
        byte[][] var16 = new byte[class26.field350][class18.field291];
        this.method219(var15, 78, var16);
        byte[] var17 = arg0.method42((byte) 21, class22.field320, class26.field353);
        this.method211(-113, var17);
        byte[] var18 = arg0.method42((byte) 21, class35.field450, class26.field353);
        this.method218(-823, var18);
        byte[] var19 = arg0.method42((byte) 21, class25.field339, class26.field353);
        class21.field303 = 0;
        this.method225(true, var19);
        this.method216(22002, var16);
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(I[B)V", line = 199)
    private final void method211(int arg0, byte[] arg1) {
        int var3 = 0;
        while (true) {
            while (arg1.length > var3) {
                int var4 = (arg1[var3++] & 0xFF) * 64 - class15.field254;
                int var5 = (arg1[var3++] & 0xFF) * 64 - class33.field438;
                if (var4 > 0 && var5 > 0 && var4 + 64 < class26.field350 && class18.field291 > var5 + 64) {
                    class36.field460 = var4 >> 6;
                    class36.field459 = class18.field291 - var5 - 1 >> 6;
                    for (int var6 = 0; var6 < 64; var6++) {
                        for (int var7 = -64; var7 < 0; var7++) {
                            int var8 = arg1[var3++] & 0xFF;
                            if (var8 != 0) {
                                byte var9 = arg1[var3++];
                                class1.method31(var9, class18.field291 - var5 - var7 - 1 - 64, -44, 3, var4 + var6);
                                if (class16.field268[class36.field459][class36.field460] == null) {
                                    class16.field268[class36.field459][class36.field460] = new class28();
                                    class16.field268[class36.field459][class36.field460].field380 = new byte[4096];
                                }
                                class16.field268[class36.field459][class36.field460].field380[(-(var7 + 1) << 6) + var6] = (byte) var8;
                            }
                        }
                    }
                    if (class16.field268[class36.field459][class36.field460] != null) {
                        class16.field268[class36.field459][class36.field460].method205(0);
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
            int var12 = 113 % ((6 - arg0) / 40);
            return;
        }
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(ZIBIIIIII[I)V", line = 283)
    private final void method212(boolean arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int[] arg9) {
        if (arg2 != 8) {
            this.field407 = null;
        }
        if (arg3 == 9) {
            arg3 = 1;
            arg4 = arg4 + 1 & 0x3;
        }
        int var11 = class12.field223 - arg5;
        if (arg3 == 10) {
            arg4 = arg4 + 3 & 0x3;
            arg3 = 1;
        }
        if (arg3 == 11) {
            arg4 = arg4 + 3 & 0x3;
            arg3 = 8;
        }
        if (arg3 == 1) {
            if (arg4 == 0) {
                for (int var68 = 0; var68 < arg6; var68++) {
                    for (int var69 = 0; var69 < arg5; var69++) {
                        if (var68 >= var69) {
                            arg9[arg8] = arg1;
                        } else if (arg0) {
                            arg9[arg8] = arg7;
                        }
                        arg8++;
                    }
                    arg8 += var11;
                }
            } else if (arg4 == 1) {
                for (int var70 = arg6 - 1; var70 >= 0; var70--) {
                    for (int var71 = 0; var71 < arg5; var71++) {
                        if (var71 <= var70) {
                            arg9[arg8] = arg1;
                        } else if (arg0) {
                            arg9[arg8] = arg7;
                        }
                        arg8++;
                    }
                    arg8 += var11;
                }
            } else if (arg4 == 2) {
                for (int var74 = 0; var74 < arg6; var74++) {
                    for (int var75 = 0; var75 < arg5; var75++) {
                        if (var75 >= var74) {
                            arg9[arg8] = arg1;
                        } else if (arg0) {
                            arg9[arg8] = arg7;
                        }
                        arg8++;
                    }
                    arg8 += var11;
                }
            } else if (arg4 == 3) {
                for (int var72 = arg6 - 1; var72 >= 0; var72--) {
                    for (int var73 = 0; var73 < arg5; var73++) {
                        if (var72 <= var73) {
                            arg9[arg8] = arg1;
                        } else if (arg0) {
                            arg9[arg8] = arg7;
                        }
                        arg8++;
                    }
                    arg8 += var11;
                }
            }
        } else if (arg3 == 2) {
            if (arg4 == 0) {
                for (int var18 = arg6 - 1; var18 >= 0; var18--) {
                    for (int var19 = 0; var19 < arg5; var19++) {
                        if (var18 >> 1 >= var19) {
                            arg9[arg8] = arg1;
                        } else if (arg0) {
                            arg9[arg8] = arg7;
                        }
                        arg8++;
                    }
                    arg8 += var11;
                }
            } else if (arg4 == 1) {
                for (int var16 = 0; var16 < arg6; var16++) {
                    for (int var17 = 0; var17 < arg5; var17++) {
                        if (var17 >= var16 << 1) {
                            arg9[arg8] = arg1;
                        } else if (arg0) {
                            arg9[arg8] = arg7;
                        }
                        arg8++;
                    }
                    arg8 += var11;
                }
            } else if (arg4 == 2) {
                for (int var14 = 0; var14 < arg6; var14++) {
                    for (int var15 = arg5 - 1; var15 >= 0; var15--) {
                        if (var15 <= var14 >> 1) {
                            arg9[arg8] = arg1;
                        } else if (arg0) {
                            arg9[arg8] = arg7;
                        }
                        arg8++;
                    }
                    arg8 += var11;
                }
            } else if (arg4 == 3) {
                for (int var12 = arg6 - 1; var12 >= 0; var12--) {
                    for (int var13 = arg5 - 1; var13 >= 0; var13--) {
                        if (var13 >= var12 << 1) {
                            arg9[arg8] = arg1;
                        } else if (arg0) {
                            arg9[arg8] = arg7;
                        }
                        arg8++;
                    }
                    arg8 += var11;
                }
            }
        } else if (arg3 == 3) {
            if (arg4 == 0) {
                for (int var66 = arg6 - 1; var66 >= 0; var66--) {
                    for (int var67 = arg5 - 1; var67 >= 0; var67--) {
                        if (var67 <= var66 >> 1) {
                            arg9[arg8] = arg1;
                        } else if (arg0) {
                            arg9[arg8] = arg7;
                        }
                        arg8++;
                    }
                    arg8 += var11;
                }
            } else if (arg4 == 1) {
                for (int var60 = arg6 - 1; var60 >= 0; var60--) {
                    for (int var61 = 0; var61 < arg5; var61++) {
                        if (var61 >= var60 << 1) {
                            arg9[arg8] = arg1;
                        } else if (arg0) {
                            arg9[arg8] = arg7;
                        }
                        arg8++;
                    }
                    arg8 += var11;
                }
            } else if (arg4 == 2) {
                for (int var62 = 0; var62 < arg6; var62++) {
                    for (int var63 = 0; var63 < arg5; var63++) {
                        if (var63 <= var62 >> 1) {
                            arg9[arg8] = arg1;
                        } else if (arg0) {
                            arg9[arg8] = arg7;
                        }
                        arg8++;
                    }
                    arg8 += var11;
                }
            } else if (arg4 == 3) {
                for (int var64 = 0; var64 < arg6; var64++) {
                    for (int var65 = arg5 - 1; var65 >= 0; var65--) {
                        if (var65 >= var64 << 1) {
                            arg9[arg8] = arg1;
                        } else if (arg0) {
                            arg9[arg8] = arg7;
                        }
                        arg8++;
                    }
                    arg8 += var11;
                }
            }
        } else if (arg3 == 4) {
            if (arg4 == 0) {
                for (int var58 = arg6 - 1; var58 >= 0; var58--) {
                    for (int var59 = 0; var59 < arg5; var59++) {
                        if (var59 >= var58 >> 1) {
                            arg9[arg8] = arg1;
                        } else if (arg0) {
                            arg9[arg8] = arg7;
                        }
                        arg8++;
                    }
                    arg8 += var11;
                }
            } else if (arg4 == 1) {
                for (int var52 = 0; var52 < arg6; var52++) {
                    for (int var53 = 0; var53 < arg5; var53++) {
                        if (var53 <= var52 << 1) {
                            arg9[arg8] = arg1;
                        } else if (arg0) {
                            arg9[arg8] = arg7;
                        }
                        arg8++;
                    }
                    arg8 += var11;
                }
            } else if (arg4 == 2) {
                for (int var56 = 0; var56 < arg6; var56++) {
                    for (int var57 = arg5 - 1; var57 >= 0; var57--) {
                        if (var56 >> 1 <= var57) {
                            arg9[arg8] = arg1;
                        } else if (arg0) {
                            arg9[arg8] = arg7;
                        }
                        arg8++;
                    }
                    arg8 += var11;
                }
            } else if (arg4 == 3) {
                for (int var54 = arg6 - 1; var54 >= 0; var54--) {
                    for (int var55 = arg5 - 1; var55 >= 0; var55--) {
                        if (var54 << 1 >= var55) {
                            arg9[arg8] = arg1;
                        } else if (arg0) {
                            arg9[arg8] = arg7;
                        }
                        arg8++;
                    }
                    arg8 += var11;
                }
            }
        } else if (arg3 != 5) {
            if (arg3 == 6) {
                if (arg4 == 0) {
                    for (int var42 = 0; var42 < arg6; var42++) {
                        for (int var43 = 0; var43 < arg5; var43++) {
                            if (var43 <= arg5 / 2) {
                                arg9[arg8] = arg1;
                            } else if (arg0) {
                                arg9[arg8] = arg7;
                            }
                            arg8++;
                        }
                        arg8 += var11;
                    }
                    return;
                }
                if (arg4 == 1) {
                    for (int var20 = 0; var20 < arg6; var20++) {
                        for (int var21 = 0; var21 < arg5; var21++) {
                            if (var20 <= arg6 / 2) {
                                arg9[arg8] = arg1;
                            } else if (arg0) {
                                arg9[arg8] = arg7;
                            }
                            arg8++;
                        }
                        arg8 += var11;
                    }
                    return;
                }
                if (arg4 == 2) {
                    for (int var22 = 0; var22 < arg6; var22++) {
                        for (int var23 = 0; var23 < arg5; var23++) {
                            if (var23 >= arg5 / 2) {
                                arg9[arg8] = arg1;
                            } else if (arg0) {
                                arg9[arg8] = arg7;
                            }
                            arg8++;
                        }
                        arg8 += var11;
                    }
                    return;
                }
                if (arg4 == 3) {
                    for (int var24 = 0; var24 < arg6; var24++) {
                        for (int var25 = 0; var25 < arg5; var25++) {
                            if (var24 >= arg6 / 2) {
                                arg9[arg8] = arg1;
                            } else if (arg0) {
                                arg9[arg8] = arg7;
                            }
                            arg8++;
                        }
                        arg8 += var11;
                    }
                    return;
                }
            }
            if (arg3 == 7) {
                if (arg4 == 0) {
                    for (int var26 = 0; var26 < arg6; var26++) {
                        for (int var27 = 0; var27 < arg5; var27++) {
                            if (var26 - arg6 / 2 >= var27) {
                                arg9[arg8] = arg1;
                            } else if (arg0) {
                                arg9[arg8] = arg7;
                            }
                            arg8++;
                        }
                        arg8 += var11;
                    }
                    return;
                }
                if (arg4 == 1) {
                    for (int var32 = arg6 - 1; var32 >= 0; var32--) {
                        for (int var33 = 0; var33 < arg5; var33++) {
                            if (var33 <= var32 - arg6 / 2) {
                                arg9[arg8] = arg1;
                            } else if (arg0) {
                                arg9[arg8] = arg7;
                            }
                            arg8++;
                        }
                        arg8 += var11;
                    }
                    return;
                }
                if (arg4 == 2) {
                    for (int var28 = arg6 - 1; var28 >= 0; var28--) {
                        for (int var29 = arg5 - 1; var29 >= 0; var29--) {
                            if (var28 - arg6 / 2 >= var29) {
                                arg9[arg8] = arg1;
                            } else if (arg0) {
                                arg9[arg8] = arg7;
                            }
                            arg8++;
                        }
                        arg8 += var11;
                    }
                    return;
                }
                if (arg4 == 3) {
                    for (int var30 = 0; var30 < arg6; var30++) {
                        for (int var31 = arg5 - 1; var31 >= 0; var31--) {
                            if (var31 <= var30 - arg6 / 2) {
                                arg9[arg8] = arg1;
                            } else if (arg0) {
                                arg9[arg8] = arg7;
                            }
                            arg8++;
                        }
                        arg8 += var11;
                    }
                    return;
                }
            }
            if (arg3 == 8) {
                if (arg4 == 0) {
                    for (int var40 = 0; var40 < arg6; var40++) {
                        for (int var41 = 0; var41 < arg5; var41++) {
                            if (var41 >= var40 - arg6 / 2) {
                                arg9[arg8] = arg1;
                            } else if (arg0) {
                                arg9[arg8] = arg7;
                            }
                            arg8++;
                        }
                        arg8 += var11;
                    }
                    return;
                }
                if (arg4 == 1) {
                    for (int var38 = arg6 - 1; var38 >= 0; var38--) {
                        for (int var39 = 0; var39 < arg5; var39++) {
                            if (var39 >= var38 - arg6 / 2) {
                                arg9[arg8] = arg1;
                            } else if (arg0) {
                                arg9[arg8] = arg7;
                            }
                            arg8++;
                        }
                        arg8 += var11;
                    }
                    return;
                }
                if (arg4 == 2) {
                    for (int var34 = arg6 - 1; var34 >= 0; var34--) {
                        for (int var35 = arg5 - 1; var35 >= 0; var35--) {
                            if (var34 - arg6 / 2 <= var35) {
                                arg9[arg8] = arg1;
                            } else if (arg0) {
                                arg9[arg8] = arg7;
                            }
                            arg8++;
                        }
                        arg8 += var11;
                    }
                    return;
                }
                if (arg4 == 3) {
                    for (int var36 = 0; var36 < arg6; var36++) {
                        for (int var37 = arg5 - 1; var37 >= 0; var37--) {
                            if (var37 >= var36 - arg6 / 2) {
                                arg9[arg8] = arg1;
                            } else if (arg0) {
                                arg9[arg8] = arg7;
                            }
                            arg8++;
                        }
                        arg8 += var11;
                    }
                    return;
                }
            }
        } else if (arg4 == 0) {
            for (int var44 = arg6 - 1; var44 >= 0; var44--) {
                for (int var45 = arg5 - 1; var45 >= 0; var45--) {
                    if (var45 >= var44 >> 1) {
                        arg9[arg8] = arg1;
                    } else if (arg0) {
                        arg9[arg8] = arg7;
                    }
                    arg8++;
                }
                arg8 += var11;
            }
        } else if (arg4 == 1) {
            for (int var50 = arg6 - 1; var50 >= 0; var50--) {
                for (int var51 = 0; var51 < arg5; var51++) {
                    if (var51 <= var50 << 1) {
                        arg9[arg8] = arg1;
                    } else if (arg0) {
                        arg9[arg8] = arg7;
                    }
                    arg8++;
                }
                arg8 += var11;
            }
        } else if (arg4 == 2) {
            for (int var48 = 0; var48 < arg6; var48++) {
                for (int var49 = 0; var49 < arg5; var49++) {
                    if (var48 >> 1 <= var49) {
                        arg9[arg8] = arg1;
                    } else if (arg0) {
                        arg9[arg8] = arg7;
                    }
                    arg8++;
                }
                arg8 += var11;
            }
        } else if (arg4 == 3) {
            for (int var46 = 0; var46 < arg6; var46++) {
                for (int var47 = arg5 - 1; var47 >= 0; var47--) {
                    if (var46 << 1 >= var47) {
                        arg9[arg8] = arg1;
                    } else if (arg0) {
                        arg9[arg8] = arg7;
                    }
                    arg8++;
                }
                arg8 += var11;
            }
        }
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(I)B", line = 1418)
    private static final byte method213(int arg0) {
        if (arg0 == -160) {
            return class35.field440 == null ? 0 : class35.field440[class35.field442];
        } else {
            return -25;
        }
    }

    @OriginalMember(owner = "mapview!p", name = "b", descriptor = "(I)V", line = 1435)
    private static final void method214(int arg0) {
        if (arg0 != 0) {
            method208((byte) 106);
        }
        if (++class28.field381 >= 64) {
            class36.field459++;
            class28.field381 = 0;
            if (class18.field291 >> 6 > class36.field459) {
                class14.method111((byte) -57);
            }
        }
        class35.field442 = (class28.field381 << 6) + class1.field75;
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(DIBIIIIIII)V", line = 1470)
    public final void method215(double arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var12 = arg5 - arg4;
        int var13 = (arg3 - arg1 << 16) / var12;
        int var14 = arg7 - arg6;
        int var15 = (arg8 - arg9 << 16) / var14;
        if (arg8 - arg9 < -arg6 + arg7) {
            return;
        }
        this.field406 = 0;
        int var16 = 56 % ((13 - arg2) / 38);
        for (int var17 = 0; var17 < var14; var17++) {
            int var18 = var15 * var17 >> 16;
            int var19 = (var17 + 1) * var15 >> 16;
            int var20 = var19 - var18;
            if (var20 > 0) {
                class14.method107(arg6 + var17, -3652, arg4);
                for (int var21 = 0; var21 < var12; var21++) {
                    int var22 = (var21 + 1) * var13 >> 16;
                    int var23 = var13 * var21 >> 16;
                    int var24 = var22 - var23;
                    if (var24 > 0) {
                        int var25 = class9.method77(0) & 0xFF;
                        if (var25 != 0) {
                            if (var25 == 47 || var25 == 53) {
                                class2.field103[var25 - 1].method104(var18, var23, var20 * 2 + 1, var24 * 2 - -1);
                                if (!(arg0 < 4.0D) && arg0 > 4.2D && arg0 > 6.2D) {
                                }
                            } else {
                                class2.field103[var25 - 1].method104(var18 - var20 / 2, -(var24 / 2) + var23, var20 * 2, var24 * 2);
                            }
                        }
                    }
                    method214(0);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(I[[B)V", line = 1588)
    private final void method216(int arg0, byte[][] arg1) {
        int var3 = class26.field350;
        int var4 = class18.field291;
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = 0;
        }
        for (int var7 = 5; var7 < var3 - 5; var7++) {
            byte[] var8 = arg1[var7 - 5];
            byte[] var9 = arg1[var7 + 5];
            for (int var10 = 0; var10 < var4; var10++) {
                int var11 = class26.field358[var8[var10] & 0xFF];
                int var12 = class26.field358[var9[var10] & 0xFF];
                if (var12 <= 0 && class7.method76(var10, -8316, var7 + 5) > 0) {
                    var12 = 64;
                }
                if (var11 <= 0 && class7.method76(var10, -8316, var7 - 5) > 0) {
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
                    var13 += (var18 >> 20) - (var17 >> 20);
                    var15 += (var18 & 0x3FF) - (var17 & 0x3FF);
                    var14 += (var18 >> 10 & 0x3FF) - ((var17 & 0xFFE46) >> 10);
                    if (var15 > 0) {
                        int var19 = var7 >> 6;
                        int var20 = var16 >> 6;
                        if (class6.field129[var20][var19] == null) {
                            class6.field129[var20][var19] = new int[4096];
                        }
                        class6.field129[var20][var19][class16.method141(var16 << 6, 4032) + class16.method141(var7, 63)] = this.method217((double) var14 / 8533.0D, (double) var13 / 8533.0D, (double) var15 / 8533.0D, false);
                    }
                }
            }
        }
        if (arg0 != 22002) {
            this.field411 = null;
        }
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(DDDZ)I", line = 1680)
    private final int method217(double arg0, double arg1, double arg2, boolean arg3) {
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
            double var16 = arg1 + 0.3333333333333333D;
            if (var16 > 1.0D) {
                var16--;
            }
            double var18 = arg2 * 2.0D - var14;
            if (var16 * 6.0D < 1.0D) {
                var8 = (var14 - var18) * 6.0D * var16 + var18;
            } else if (var16 * 2.0D < 1.0D) {
                var8 = var14;
            } else if (var16 * 3.0D < 2.0D) {
                var8 = (0.6666666666666666D - var16) * (-var18 + var14) * 6.0D + var18;
            } else {
                var8 = var18;
            }
            double var22 = arg1 - 0.3333333333333333D;
            if (var22 < 0.0D) {
                var22++;
            }
            if (arg1 * 6.0D < 1.0D) {
                var10 = (var14 - var18) * 6.0D * arg1 + var18;
            } else if (arg1 * 2.0D < 1.0D) {
                var10 = var14;
            } else if (arg1 * 3.0D < 2.0D) {
                var10 = (var14 - var18) * (-arg1 + 0.6666666666666666D) * 6.0D + var18;
            } else {
                var10 = var18;
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
        }
        int var24 = (int) (var8 * 256.0D);
        int var25 = (int) (var10 * 256.0D);
        int var26 = (int) (var12 * 256.0D);
        int var27 = (var24 << 16) + (var25 << 8) + var26;
        if (arg3) {
            field402 = null;
        }
        return var27;
    }

    @OriginalMember(owner = "mapview!p", name = "b", descriptor = "(I[B)V", line = 1771)
    private final void method218(int arg0, byte[] arg1) {
        if (arg0 != -823) {
            return;
        }
        int var3 = 0;
        while (true) {
            while (var3 < arg1.length) {
                int var4 = (arg1[var3++] & 0xFF) * 64 - class15.field254;
                int var5 = (arg1[var3++] & 0xFF) * 64 - class33.field438;
                if (var4 > 0 && var5 > 0 && class26.field350 > var4 + 64 && var5 + 64 < class18.field291) {
                    class36.field459 = class18.field291 - var5 - 1 >> 6;
                    class36.field460 = var4 >> 6;
                    for (int var6 = 0; var6 < 64; var6++) {
                        for (int var7 = -64; var7 < 0; var7++) {
                            int var8 = arg1[var3++] & 0xFF;
                            if (var8 != 0) {
                                byte var9 = arg1[var3++];
                                class1.method31(var9, class18.field291 - var7 - var5 - 1 - 64, arg0 + 949, 4, var4 + var6);
                                if (field410[class36.field459][class36.field460] == null) {
                                    field410[class36.field459][class36.field460] = new class28();
                                    field410[class36.field459][class36.field460].field380 = new byte[4096];
                                }
                                field410[class36.field459][class36.field460].field380[(-(var7 + 1) << 6) + var6] = (byte) var8;
                            }
                        }
                    }
                    if (field410[class36.field459][class36.field460] != null) {
                        field410[class36.field459][class36.field460].method205(0);
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

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "([BI[[B)V", line = 1852)
    private final void method219(byte[] arg0, int arg1, byte[][] arg2) {
        if (arg1 < 49) {
            this.method216(62, null);
        }
        int var4 = 0;
        while (true) {
            while (arg0.length > var4) {
                int var5 = (arg0[var4++] & 0xFF) * 64 - class15.field254;
                int var6 = (arg0[var4++] & 0xFF) * 64 - class33.field438;
                if (var5 > 0 && var6 > 0 && class26.field350 > var5 + 64 && class18.field291 > var6 + 64) {
                    for (int var7 = 0; var7 < 64; var7++) {
                        byte[] var8 = arg2[var7 + var5];
                        int var9 = class18.field291 - var6 - 1;
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

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(IIIIIIIIIII)V", line = 1909)
    public final void method220(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (this.field406 == 0) {
            int var12 = arg3 - arg8;
            int var13 = arg5 - arg4;
            int var14 = (arg6 - arg1 << 16) / var13;
            int var15 = (arg2 - arg0 << 16) / var12;
            for (int var16 = 0; var16 < var12; var16++) {
                int var17 = var15 * var16 >> 16;
                int var18 = (var16 + 1) * var15 >> 16;
                int var19 = var18 - var17;
                if (var19 > 0) {
                    class14.method107(var16 + arg8, -3652, arg4);
                    for (int var20 = 0; var20 < var13; var20++) {
                        int var21 = var14 * var20 >> 16;
                        int var22 = (var20 + 1) * var14 >> 16;
                        int var23 = var22 - var21;
                        if (var23 > 0) {
                            int var24 = class14.method110(-123) & 0xFF;
                            if (var24 != 0) {
                                this.field412[this.field406] = var24 - 1;
                                this.field403[this.field406] = var19 / 2 + var17;
                                this.field407[this.field406] = var23 / 2 + var21;
                                this.field406++;
                            }
                        }
                        method214(0);
                    }
                }
            }
        }
        int var25 = 0;
        if (arg9 != -64) {
            return;
        }
        while (var25 < this.field406) {
            if (class16.field262[this.field412[var25]] != null) {
                class16.field262[this.field412[var25]].method232(this.field403[var25] - 7, this.field407[var25] + -7);
            }
            var25++;
        }
        if (arg10 > 0) {
            for (int var26 = 0; var26 < this.field406; var26++) {
                if (this.field412[var26] == arg7) {
                    class16.field262[this.field412[var26]].method232(this.field403[var26] - 7, this.field407[var26] + -7);
                    if (arg10 % 10 < 5) {
                        class12.method95(this.field403[var26], this.field407[var26], 15, 16776960, 128);
                        class12.method95(this.field403[var26], this.field407[var26], 7, 16777215, 256);
                    }
                }
            }
        }
        this.field406 = 0;
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(IBI)V", line = 2021)
    private final void method221(int arg0, byte arg1, int arg2) {
        int var4 = arg2 >> 6;
        int var5 = arg0 >> 6;
        class25.field346[0] = new byte[var4][var5][];
        class25.field346[1] = new byte[var4][var5][];
        class25.field346[2] = new byte[var4][var5][];
        class25.field346[3] = new byte[var4][var5][];
        class25.field346[4] = new byte[var4][var5][];
        field410 = new class28[var4][var5];
        if (arg1 != 45) {
            this.method221(74, (byte) -97, 93);
        }
        class6.field129 = new int[var4][var5][];
        class16.field268 = new class28[var4][var5];
    }

    @OriginalMember(owner = "mapview!p", name = "b", descriptor = "(IIIIIIIII)V", line = 2046)
    public final void method222(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field406 = 0;
        int var10 = arg2 - arg0;
        int var11 = arg3 - arg8;
        int var12 = (arg7 - arg6 << 16) / var10;
        int var13 = (arg5 - arg4 << 16) / var11;
        int var14 = 0;
        if (arg1 != 26183) {
            return;
        }
        while (var11 > var14) {
            int var15 = var13 * var14 >> 16;
            int var16 = (var14 + 1) * var13 >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                class14.method107(var14 + arg8, -3652, arg0);
                for (int var18 = 0; var18 < var10; var18++) {
                    int var19 = var12 * var18 >> 16;
                    int var20 = (var18 + 1) * var12 >> 16;
                    int var21 = var20 - var19;
                    if (var21 > 0) {
                        int var22 = method208((byte) -128) & 0xFF;
                        if (var22 != 0) {
                            int var23;
                            if (var17 == 1) {
                                var23 = var15;
                            } else {
                                var23 = var16 - 1;
                            }
                            int var24 = 13421772;
                            if (var22 >= 5 && var22 <= 8 || var22 >= 13 && var22 <= 16 || var22 >= 21 && var22 <= 24 || var22 == 27 || var22 == 28) {
                                var22 -= 4;
                                var24 = 13369344;
                            }
                            int var25;
                            if (var21 == 1) {
                                var25 = var19;
                            } else {
                                var25 = var20 - 1;
                            }
                            if (var22 == 1) {
                                class12.method97(var15, var19, var21, var24);
                            } else if (var22 == 2) {
                                class12.method99(var15, var19, var17, var24);
                            } else if (var22 == 3) {
                                class12.method97(var23, var19, var21, var24);
                            } else if (var22 == 4) {
                                class12.method99(var15, var25, var17, var24);
                            } else if (var22 == 9) {
                                class12.method97(var15, var19, var21, 16777215);
                                class12.method99(var15, var19, var17, var24);
                            } else if (var22 == 10) {
                                class12.method97(var23, var19, var21, 16777215);
                                class12.method99(var15, var19, var17, var24);
                            } else if (var22 == 11) {
                                class12.method97(var23, var19, var21, 16777215);
                                class12.method99(var15, var25, var17, var24);
                            } else if (var22 == 12) {
                                class12.method97(var15, var19, var21, 16777215);
                                class12.method99(var15, var25, var17, var24);
                            } else if (var22 == 17) {
                                class12.method99(var15, var19, 1, var24);
                            } else if (var22 == 18) {
                                class12.method99(var23, var19, 1, var24);
                            } else if (var22 == 19) {
                                class12.method99(var23, var25, 1, var24);
                            } else if (var22 == 20) {
                                class12.method99(var15, var25, 1, var24);
                            } else if (var22 == 25) {
                                for (int var27 = 0; var27 < var21; var27++) {
                                    class12.method99(var15 + var27, var25 - var27, 1, var24);
                                }
                            } else if (var22 == 26) {
                                for (int var26 = 0; var26 < var21; var26++) {
                                    class12.method99(var15 + var26, var19 + var26, 1, var24);
                                }
                            }
                        }
                        int var28 = class14.method110(-127) & 0xFF;
                        if (var28 != 0) {
                            this.field412[this.field406] = var28 - 1;
                            this.field403[this.field406] = var17 / 2 + var15;
                            this.field407[this.field406] = var21 / 2 + var19;
                            this.field406++;
                        }
                    }
                    method214(0);
                }
            }
            var14++;
        }
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(Z)V", line = 2223)
    public static void method223(boolean arg0) {
        if (!arg0) {
            method224(-5, true, 111, -99);
        }
        field408 = null;
        field402 = null;
        field405 = null;
        field410 = null;
        field414 = null;
        field409 = null;
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(IZII)Lh;", line = 2243)
    public static final class15 method224(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        int var4 = 1;
        int var5 = arg2 / arg0;
        while (var5 != 0) {
            var5 /= arg0;
            var4++;
        }
        int var6 = var4;
        if (arg2 < 0 || arg1) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg2 < 0) {
            var7[0] = 45;
        } else if (arg1) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var9 = arg2 % arg0;
            arg2 /= arg0;
            if (var9 < 0) {
                var9 = -var9;
            }
            if (var9 > 9) {
                var9 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var9 + 48);
        }
        if (arg3 != -11342) {
            method213(73);
        }
        class15 var10 = new class15();
        var10.field250 = var6;
        var10.field247 = var7;
        return var10;
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(Z[B)V", line = 2304)
    private final void method225(boolean arg0, byte[] arg1) {
        if (!arg0) {
            return;
        }
        int var3 = 0;
        while (true) {
            while (var3 < arg1.length) {
                int var4 = (arg1[var3++] & 0xFF) * 64 - class15.field254;
                int var5 = (arg1[var3++] & 0xFF) * 64 - class33.field438;
                if (var4 > 0 && var5 > 0 && class26.field350 > var4 + 64 && class18.field291 > var5 + 64) {
                    for (int var6 = 0; var6 < 64; var6++) {
                        int var7 = class18.field291 - var5 - 1;
                        for (int var8 = -64; var8 < 0; var8++) {
                            while (true) {
                                int var9 = arg1[var3++] & 0xFF;
                                if (var9 == 0) {
                                    break;
                                }
                                if (var9 < 29) {
                                    class1.method31((byte) var9, class18.field291 - var5 - var8 - 65, -124, 0, var4 + var6);
                                } else if (var9 >= 160) {
                                    class1.method31((byte) (var9 - 159), class18.field291 - var5 - var8 - 64 - 1, 93, 2, var4 + var6);
                                    if (class21.field303 >= 1500) {
                                        break;
                                    }
                                    this.field404[class21.field303] = var4 + var6;
                                    this.field411[class21.field303] = var7;
                                    this.field413[class21.field303] = var9 - 160;
                                    class21.field303++;
                                } else {
                                    class1.method31((byte) (var9 - 28), class18.field291 - var5 - var8 - 64 - 1, -18, 1, var4 + var6);
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
}
